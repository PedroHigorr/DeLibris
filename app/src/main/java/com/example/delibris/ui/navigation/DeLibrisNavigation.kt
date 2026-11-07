package com.example.delibris.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.delibris.core.common.MainTab
import com.example.delibris.ui.components.NavigationBar
import com.example.delibris.ui.screens.Book
import com.example.delibris.ui.screens.Collection
import com.example.delibris.ui.screens.Friends
import com.example.delibris.ui.screens.Home
import com.example.delibris.ui.screens.Profile

@Composable
fun DeLibrisNavigation() {
    val backStack = rememberNavBackStack(Routes.HomeRoute)

    val selectedTab = when(backStack.lastOrNull()){
        Routes.HomeRoute -> MainTab.HOME
        is Routes.BookRoute -> MainTab.COLLECTIONS
        Routes.FriendsRoute -> MainTab.FRIENDS
        Routes.ProfileRoute -> MainTab.PROFILE
        Routes.CollectionsRoute -> MainTab.COLLECTIONS
        else -> MainTab.HOME
    }


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
          NavDisplay(
              modifier = Modifier.fillMaxSize(),
              backStack = backStack,
              onBack = { backStack.removeLastOrNull() },
              entryProvider = entryProvider {
                  entry<Routes.HomeRoute> {
                      Home(
                          onCardClick = {
                              backStack.addAll(
                                  listOf(
                                      Routes.CollectionsRoute,
                                      Routes.BookRoute(it)
                                  )
                              )
                          },
                          onAvatarClick = {
                              backStack.add(Routes.FriendsRoute)
                          }
                      )
                  }
                  entry<Routes.BookRoute> {
                      Book(bookId = it.bookId)
                  }
                  entry<Routes.FriendsRoute> {
                      Friends()
                  }
                  entry <Routes.CollectionsRoute> {
                      Collection()
                  }
                  entry <Routes.ProfileRoute> {
                      Profile()
                  }
              }
          )

          NavigationBar(
              modifier = Modifier
                  .align(Alignment.BottomCenter)
                  .navigationBarsPadding()
                  .padding(bottom = 8.dp),
              selectedTab = selectedTab,
              onTabClick = { tab ->

                  when(tab){
                      MainTab.HOME -> {
                          while (backStack.size > 1){
                              backStack.removeLastOrNull()
                          }
                      }
                      MainTab.FRIENDS -> {
                          if(backStack.lastOrNull() != Routes.FriendsRoute){
                              backStack.add(Routes.FriendsRoute)
                          }
                      }
                      MainTab.COLLECTIONS -> {
                          val index = backStack.indexOfLast {
                              it == Routes.CollectionsRoute
                          }
                          if (index >= 0){
                              while (backStack.lastIndex > index){
                                  backStack.removeLastOrNull()
                              }
                          }
                          else{
                              backStack.add(Routes.CollectionsRoute)
                          }
                      }
                      MainTab.PROFILE -> {
                          if (backStack.lastOrNull() != Routes.ProfileRoute){
                              backStack.add(Routes.ProfileRoute)
                          }
                      }
                  }

              }
          )
      }
}

@Preview
@Composable
fun DeLibrisPreview(){
    DeLibrisNavigation()
}