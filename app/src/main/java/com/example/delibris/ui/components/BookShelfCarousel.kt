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

@Composable
fun BookShelfCarousel(
    shelfFilter: ShelfFilter
){
    val mockUsers = MockUserBookConnections.usersBookConnections
    val filter = when(shelfFilter){
        ShelfFilter.ALL -> mockUsers
        ShelfFilter.READ -> mockUsers.filter {
            it.status == ReadingStatus.READ
        }
        ShelfFilter.READING -> mockUsers.filter {
            it.status == ReadingStatus.READING
        }
        ShelfFilter.WISH_LIST -> mockUsers.filter {
            it.status == ReadingStatus.WISH_LIST
        }
    }

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(5.dp)
    ) {
        items(
            items = filter,
            key = { userCon -> "${userCon.userId} - ${userCon.bookId}" }
        ) {userCon ->

            BookShelfItem(userCon)
        }
    }
}