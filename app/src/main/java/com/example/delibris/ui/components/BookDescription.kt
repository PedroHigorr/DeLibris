package com.example.delibris.ui.components

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
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.domain.model.BookUserConnectionModel
import com.example.delibris.sample.MockBookUserConCon
import com.example.delibris.sample.MockBooks

@Composable
fun BookDescription(
    bookId: Int,
    userId: Int
) {

    val conUser = MockBookUserConCon.usersBookConnections.first{
        it.userId == userId && it.bookId == bookId
    }

    val currentBook = MockBooks.books.first{
        it.id == bookId
    }

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(50.dp),
    ) {
        ElevatedCard(
            Modifier
                .width(124.dp)
                .height(170.dp)
        ) {
            AsyncImage(
                model = currentBook.coverUrl,
                contentDescription = "Book Cover",
                contentScale = ContentScale.Crop
            )
        }

        Column(
            modifier = Modifier.align(Alignment.CenterVertically),
            verticalArrangement = Arrangement.spacedBy(15.dp),

        ) {
            Text(
                text = currentBook.tittle,
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                lineHeight = 15.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = currentBook.author,
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                lineHeight = 15.sp,
                fontWeight = FontWeight.Thin,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth()
            )

            Status(
                status = conUser.status,

                )
        }
    }
}

@Preview
@Composable
fun  BookDesPreview(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
            BookDescription(bookId = 1, userId = 1)
        }
    }
}