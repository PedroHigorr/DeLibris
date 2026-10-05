package com.example.delibris.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.core.common.ShelfFilter
import com.example.delibris.domain.model.MockUserBookConnections
import com.example.delibris.domain.model.MockUserUi

@Composable
fun BookShelfCarousel(
    shelfFilter: ShelfFilter
){
    //Mock de livros
    val mockUsers = MockUserBookConnections.usersBookConnections
    val user = mockUsers
        .filter { it.userId == MockUserUi.user1.id  }
        .sortedByDescending { it.date }
    // -----

    val filter = when(shelfFilter){
        ShelfFilter.ALL -> user
        ShelfFilter.READ -> user.filter {
            it.status == ReadingStatus.READ
        }
        ShelfFilter.READING -> user.filter {
            it.status == ReadingStatus.READING
        }
        ShelfFilter.WISH_LIST -> user.filter {
            it.status == ReadingStatus.WISH_LIST
        }
    }

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(5.dp)
    ) {
        items(
            items = filter,
            key = { userCon -> userCon.id }
        ) {userCon ->

            BookShelfItem(userCon)
        }
    }
}