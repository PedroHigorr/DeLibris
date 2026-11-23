package com.example.delibris.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.R

@Composable
fun IconText(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
    text: @Composable () -> Unit,
){
    Row (
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = tint
        )

        text()
    }
}

//@Preview()
//@Composable
//fun IconTextPreview(){
//    Scaffold(modifier =  Modifier.fillMaxSize()) { innerPadding ->
//
//        IconText(
//            icon = R.drawable.book2,
//            modifier = Modifier.padding(innerPadding)
//        ) {
//            Text("Teste")
//        }
//    }
//}