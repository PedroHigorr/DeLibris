package com.example.delibris.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.R
import com.example.delibris.sample.MockBooks
import com.example.delibris.ui.theme.OutlineSoft

@Composable
fun BookEdition(
    modifier: Modifier = Modifier,
    bookId: Int
){
    val mockBook = MockBooks.books.firstOrNull { it.id == bookId }
    Box(
        modifier = modifier
            .fillMaxWidth(0.9f)
            .border(
                width = 1.dp,
                color = OutlineSoft,
                shape = RoundedCornerShape(15),
            )
    ){
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            IconText(
                icon = R.drawable.book2
            ) {
                Text(
                    text = "Edição",
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                modifier = Modifier.padding(start = 38.dp),
                text = mockBook?.edition ?: "Edição não informada."
            )

            IconText(
                modifier = Modifier.padding(start = 10.dp),
                icon = R.drawable.world
            ) {
                Text(
                    text = mockBook?.language ?: "Língua não informada."
                )
            }

            IconText(
                modifier = Modifier.padding(start = 10.dp),
                icon = R.drawable.pen
            ) {
                Text(
                    text = mockBook?.translator ?: "Tradutor não encontrado."
                )
            }

            IconText(
                modifier = Modifier.padding(start = 10.dp),
                icon = R.drawable.page
            ) {
                Text(
                    text = "${mockBook?.pageNumbers ?: "Quantidade de páginas não encontradas."}"
                )
            }
        }


    }
}


@Preview
@Composable
fun BookEditionPreview(){

    Scaffold(Modifier.fillMaxSize()) {innerPadding ->

        BookEdition(
            modifier = Modifier.padding(innerPadding),
            bookId = 1
            )
    }
}