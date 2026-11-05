package com.example.delibris.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.core.common.ShelfFilter
import com.example.delibris.domain.model.MockUserBookConnections
import com.example.delibris.domain.model.MockUserUi
import com.example.delibris.ui.components.AppHeader
import com.example.delibris.ui.components.BookCarousel
import com.example.delibris.ui.components.BookSearchBar
import com.example.delibris.ui.components.BookShelfCarousel
import com.example.delibris.ui.components.BookShelfItem
import com.example.delibris.ui.components.NotificationBell
import com.example.delibris.ui.components.ShelfStatusFilter
import com.example.delibris.ui.theme.Ivory

@Composable
fun Home(){

    var selectedFilter by rememberSaveable {
        mutableStateOf(ShelfFilter.ALL)
    }

    val mockUsers = MockUserBookConnections.usersBookConnections
    val user = mockUsers
        .filter { it.userId == MockUserUi.user1.id  }
        .sortedByDescending { it.date }
    // -----

    val filter = when(selectedFilter){
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

    Scaffold(
        containerColor = Ivory,
        modifier = Modifier
            .fillMaxSize() ) { innerPadding ->
//            Column(
//                verticalArrangement = Arrangement.spacedBy(30.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier.padding(innerPadding).fillMaxSize()
//            ) {
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                AppHeader(modifier = Modifier.padding(bottom = 20.dp)){
                NotificationBell(2) }
            }
            item {
                BookSearchBar(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                )
            }

            item {
                BookCarousel(
                    modifier = Modifier.padding(top = 20.dp)
                )
            }

            stickyHeader {
                ShelfStatusFilter(
                    selectedFilter =  selectedFilter,
                    onFilterSelected = {selectedFilter = it },
                    modifier = Modifier
                        .background(Ivory)
                        .padding(top = 20.dp)
                    )
            }
            items(
                items = filter,
                key = { userCon -> userCon.id }
            ) {userCon ->

                BookShelfItem(userCon)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home()
}