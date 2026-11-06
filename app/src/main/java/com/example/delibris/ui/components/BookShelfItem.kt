package com.example.delibris.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.domain.model.BookUserConnectionModel
import com.example.delibris.sample.MockBooks
import com.example.delibris.sample.MockBookUserConCon
import com.example.delibris.ui.theme.OutlineSoft

@Composable
fun BookShelfItem(
    userBookUserConnectionModel: BookUserConnectionModel,
    modifier: Modifier = Modifier,
    onCardClick: (Int) -> Unit,
    onAvatarClick: () -> Unit
){

    val book = MockBooks.books.first { it.id == userBookUserConnectionModel.bookId }
    val user = MockBookUserConCon.usersBookConnections.filter { it.bookId == book.id }
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(horizontal = 16.dp)
    )
    {
        ElevatedCard(
            modifier =
                Modifier
                    .width(60.dp)
                    .height(82.dp)
        )
        {
            AsyncImage(
                model = book.coverUrl,
                contentDescription = "Book Cover",
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(onClick = { onCardClick(book.id) } ),
                contentScale = ContentScale.Crop
            )
        }

        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .height(82.dp)
                    .border(
                        width = 1.dp,
                        color =  OutlineSoft.copy(alpha = 0.5f),
                        shape = RoundedCornerShape(12.dp))
                    .padding(
                        horizontal = 10.dp,
                        vertical = 6.dp
                    )
            ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable(onClick = { onCardClick(book.id) } ),
                ) {

                Text(
                    text = book.tittle,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 15.sp
                )

                Text(
                    book.author,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Light,
                    fontSize = 10.sp,
                    lineHeight = 5.sp
                )

                Status(userBookUserConnectionModel.status, Modifier.padding(top = 15.dp))

            }

            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Icon(Icons.Default.MoreVert, contentDescription = null)
                AvatarStack(users = user, onAvatarClick = onAvatarClick)
            }
        }
    }
}

@Preview
@Composable
fun BookShelfItemPreview(){
    Scaffold(modifier = Modifier.fillMaxWidth()) { innerPadding ->
        BookShelfItem(
            onCardClick = {},
            onAvatarClick = {},
            modifier = Modifier.padding(innerPadding),
            userBookUserConnectionModel = BookUserConnectionModel(id =1, userId = 1, bookId = 1, status = ReadingStatus.READ)
        )
    }
}