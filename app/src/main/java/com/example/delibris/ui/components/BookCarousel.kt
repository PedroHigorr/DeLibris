package com.example.delibris.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.domain.model.MockUserBookConnections
import com.example.delibris.domain.model.MockUserUi
import com.example.delibris.ui.theme.Terracotta

@Composable
fun BookCarousel(modifier: Modifier = Modifier){

    //Mock de livros
    val filter = MockUserBookConnections.usersBookConnections.filter {
        it.userId == MockUserUi.user1.id &&
        it.status == ReadingStatus.WISH_LIST
    }
        .sortedByDescending { it.date }
    // ----

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(20.dp)) {
        Box(modifier = Modifier.fillMaxWidth()){
            Text(
                text = "Para Ler",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.align(Alignment.CenterStart).padding(start = 20.dp)
            )

            Text(
                text = "Ver mais",
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp,
                fontFamily = FontFamily.Monospace,
                color = Terracotta,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.align(Alignment.CenterEnd).padding(end = 20.dp)
                )
        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            contentPadding = PaddingValues(horizontal = 10.dp)
        ) {
            items(
                items = filter,
                key = { userCon -> userCon.id}
            ) {userCon ->
                BookCard(userCon)
            }

        }
    }
}

//@Preview
//@Composable
//fun BookCarouselPreview(){
//    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//        BookCarousel(modifier = Modifier.padding(innerPadding))
//    }
//}