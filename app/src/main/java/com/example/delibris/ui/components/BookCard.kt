package com.example.delibris.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.delibris.domain.model.MockBooks
import com.example.delibris.domain.model.MockUserBookConnections


@Composable
fun BookCard(userBookConnection: BookUserConnectionModel){

    val book = MockBooks.books.first{ it.id == userBookConnection.bookId}

    Column(
        modifier = Modifier.width(123.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {

        ElevatedCard(
            modifier = Modifier
                .width(124.dp)
                .height(170.dp)
        ) {

            AsyncImage(
                model = book.coverUrl,
                contentDescription = "Book Cover",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }

        Column() {
            Text(
                text = book.tittle,
                fontFamily = FontFamily.Serif,
                lineHeight = 15.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = book.author,
                fontSize = 10.sp,
                lineHeight = 5.sp,
                fontWeight = FontWeight.Thin,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = userBookConnection.status.value,
                color = statusColor(userBookConnection.status),
                fontSize = 10.sp,
                lineHeight = 5.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            )
        }
        Box(){
            val users = MockUserBookConnections.usersBookConnections.filter { it.bookId == book.id }

            AvatarStack(users){}
        }

    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun BookCardPreview() {
//    Scaffold(
//        modifier = Modifier.fillMaxSize()
//    ) { innerPadding ->
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//                .padding(16.dp)
//        ) {
//            BookCard(
//                userBookConnection = BookUserConnectionModel(
//                    userId = 1,
//                    bookId = 1,
//                    status = ReadingStatus.READ
//                )
//            )
//        }
//    }
//}