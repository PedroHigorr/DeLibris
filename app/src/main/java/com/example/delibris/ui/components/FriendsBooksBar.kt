package com.example.delibris.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.R
import com.example.delibris.ui.theme.IvoryHighlight
import com.example.delibris.ui.theme.OutlineSoft
import com.example.delibris.ui.theme.Terracotta

@Composable
fun FriendsBookBar(
    modifier: Modifier = Modifier,
    id: Int,
){



    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .border(
                width = 1.dp,
                color = OutlineSoft,
                shape = RoundedCornerShape(15),
            )
            .background(IvoryHighlight)
    ){
        Column(
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

            Row() {
//                AvatarStack(
//
//                ) { }
            }
        }

    }
}


@Preview
@Composable
fun FriendsBookBarPreview(){

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        Box(modifier = Modifier.padding(innerPadding)){

//            FriendsBookBar()
        }

    }
}