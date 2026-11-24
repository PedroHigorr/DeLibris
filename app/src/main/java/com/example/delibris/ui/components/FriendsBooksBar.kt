package com.example.delibris.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.R
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.domain.model.BookUserConnectionModel
import com.example.delibris.sample.MockBookUserConCon
import com.example.delibris.ui.theme.IvoryHighlight
import com.example.delibris.ui.theme.OutlineSoft
import com.example.delibris.ui.theme.Terracotta

@Composable
fun FriendsBookBar(
    modifier: Modifier = Modifier,
    users: List<BookUserConnectionModel>
){

    val reading = users.filter {
        it.status == ReadingStatus.READING
    }
    
    val read = users.filter {
        it.status == ReadingStatus.READ
    }

    val wish = users.filter {
        it.status == ReadingStatus.WISH_LIST
    }


    Box(
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = OutlineSoft,
                shape = RoundedCornerShape(15),
            )
            .background(IvoryHighlight)
    ){
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconText(
                    modifier = Modifier.weight(1f),
                    icon = R.drawable.group,
                    tint = Terracotta
                ) {
                    Text(
                        text = "Amigos e este livro"
                    )
                }

                SeeMoreButton(
                    onSeeMoreClick = {}
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                AvatarStack(
                    users = users
                ) { }

                VerticalDivider( modifier = Modifier.height(30.dp).padding(start = 10.dp) )

                ShowStatusQuantity( read.size, status = ReadingStatus.READ)

                ShowStatusQuantity( reading.size, status = ReadingStatus.READING )

                ShowStatusQuantity( wish.size, status = ReadingStatus.WISH_LIST)

            }
        }

    }
}

@Composable
private fun ShowStatusQuantity(
    quantity: Int,
    status: ReadingStatus
){

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier.padding(horizontal = 5.dp) ) {
        Box(
            modifier = Modifier
                .background(color = statusColor(status), shape = CircleShape)
                .size(8.dp)
        )
        Text(text = "$quantity ${status.value}", color = statusColor(status))
    }
}

@Preview
@Composable
fun FriendsBookBarPreview(){

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        Box(modifier = Modifier.padding(innerPadding)){

            FriendsBookBar(users = MockBookUserConCon.usersBookConnections.filter {
                it.bookId == 3
            })
        }

    }
}