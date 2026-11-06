package com.example.delibris.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.delibris.ui.screens.Book
import com.example.delibris.ui.screens.Friends
import com.example.delibris.ui.screens.Home
import com.example.delibris.ui.theme.DeLibrisTheme

@Composable
fun DeLibrisNavigation(){
    val backStack = rememberNavBackStack(Routes.HomeRoute)

        NavDisplay(
            backStack = backStack,
            onBack = {backStack.removeLastOrNull()},
            entryProvider = entryProvider {
                entry <Routes.HomeRoute>{
                    Home(
                        onCardClick = { it ->
                            backStack.add(Routes.BookRoute(it))
                        },
                        onAvatarClick = {
                            backStack.add(Routes.FriendsRoute)
                        }
                    )
                }
                entry <Routes.BookRoute> {
                    Book(id = it.bookId)
                }
                entry <Routes.FriendsRoute> {
                    Friends()
                }
            }
        )
}