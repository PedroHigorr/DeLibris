package com.example.delibris.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Routes : NavKey{
    @Serializable
    data object HomeRoute: Routes

    @Serializable
    data class BookRoute(val bookId: Int): Routes

    @Serializable
    data object FriendsRoute: Routes
}
