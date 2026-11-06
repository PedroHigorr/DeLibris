package com.example.delibris.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
import com.example.delibris.ui.screens.Friends
import com.example.delibris.ui.screens.Home

@Composable
fun DeLibrisNavigation() {
    val backStack = rememberNavBackStack(Routes.HomeRoute)
    var selectedTab by remember { mutableStateOf(MainTab.HOME) }

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
                              backStack.add(Routes.BookRoute(it))
                          },
                          onAvatarClick = {
                              backStack.add(Routes.FriendsRoute)
                          }
                      )
                  }
                  entry<Routes.BookRoute> {
                      Book(id = it.bookId)
                  }
                  entry<Routes.FriendsRoute> {
                      Friends()
                  }
              }
          )

          NavigationBar(
              modifier = Modifier
                  .align(Alignment.BottomCenter)
                  .navigationBarsPadding()
                  .padding(bottom = 8.dp),
              selectedTab = selectedTab,
              onTabClick = { selectedTab = it }
          )
      }
}

@Preview
@Composable
fun DeLibrisPreview(){
    DeLibrisNavigation()
}