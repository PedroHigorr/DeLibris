package com.example.delibris.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.domain.model.BookUIModel
import com.example.delibris.domain.model.BookUserConnectionModel
import com.example.delibris.sample.MockBookUserConCon
import com.example.delibris.sample.MockBooks
import com.example.delibris.sample.MockUserUiModel
import com.example.delibris.ui.components.BookDescription
import com.example.delibris.ui.theme.Ivory

@Composable
fun Book(
    modifier: Modifier = Modifier,
    bookId: Int,
    ){
    val currentUser = MockUserUiModel.user1.id

    Scaffold(
        containerColor = Ivory,
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->

        Box(modifier = Modifier
            .padding(innerPadding)
        ){

            LazyColumn() {
                item {
                    BookDescription(
                        bookId = bookId,
                        userId = currentUser
                    )
                }
            }
        }
    }

}


@Preview
@Composable
fun BookPreview(){
    Scaffold(Modifier.fillMaxSize()) { innerPadding ->
        Book(modifier = Modifier.padding(innerPadding), 2)
    }
}