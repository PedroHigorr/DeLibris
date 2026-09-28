package com.example.delibris.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.core.common.ShelfFilter

@Composable
fun ShelfStatusFilter(
    modifier: Modifier = Modifier
){

    var selectedFilter by remember { mutableStateOf(ShelfFilter.ALL) }

    Column(modifier = modifier.fillMaxWidth().padding(start = 15.dp)) {

        Box(){
            Text(
                text = "Minha Estante",
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            StatusButton(
                text = "Todos",
                selected = selectedFilter == ShelfFilter.ALL
                ){
                selectedFilter = ShelfFilter.ALL
            }
            StatusButton(
                text = ReadingStatus.READ.value,
                selected = selectedFilter == ShelfFilter.READ
            ){
                selectedFilter = ShelfFilter.READ
            }
            StatusButton(
                text = ReadingStatus.WISH_LIST.value,
                selected = selectedFilter == ShelfFilter.WISH_LIST
            ){
                selectedFilter = ShelfFilter.WISH_LIST
            }
            StatusButton(
                text = ReadingStatus.READING.value,
                selected = selectedFilter == ShelfFilter.READING
            ){
                selectedFilter = ShelfFilter.READING
            }
        }
    }
}

//@Preview
//@Composable
//fun ReadingFilterPreview(){
//
//    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//        ReadingStatusFilter(modifier = Modifier.padding(innerPadding))
//    }
//}