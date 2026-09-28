package com.example.delibris.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.domain.model.BookUserConnectionModel
import com.example.delibris.ui.components.AppHeader
import com.example.delibris.ui.components.BookCarousel
import com.example.delibris.ui.components.BookSearchBar
import com.example.delibris.ui.components.BookShelfItem
import com.example.delibris.ui.components.NotificationBell
import com.example.delibris.ui.components.ShelfStatusFilter
import com.example.delibris.ui.theme.Ivory

@Composable
fun Home(){

    Scaffold(
        containerColor = Ivory,
        modifier = Modifier
            .fillMaxSize() ) { innerPadding ->
            Column(
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(innerPadding).fillMaxSize()
            ) {
                AppHeader(){
                    NotificationBell(2)
                }

                BookSearchBar()

                BookCarousel()

                ShelfStatusFilter()

                BookShelfItem(userBookUserConnectionModel = BookUserConnectionModel(1, 1, ReadingStatus.READ))

            }
        }
}


@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home()
}