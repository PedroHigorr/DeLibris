package com.example.delibris.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.core.common.ShelfFilter

@Composable
fun ShelfStatusFilter(
    selectedFilter: ShelfFilter,
    onFilterSelected: (ShelfFilter) -> Unit,
    modifier: Modifier = Modifier
){

//    var selectedFilter by remember { mutableStateOf(ShelfFilter.ALL) }

    Column(modifier = modifier.fillMaxWidth()) {

        Box(
            modifier = Modifier.padding(start = 20.dp).fillMaxWidth()
        ){
            Text(
                text = "Minha Estante",
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.padding(start = 20.dp)
        ) {
            StatusButton(
                text = "Todos",
                selected = selectedFilter == ShelfFilter.ALL
                ){
                onFilterSelected(ShelfFilter.ALL)
            }
            StatusButton(
                text = ReadingStatus.READ.value,
                selected = selectedFilter == ShelfFilter.READ
            ){
                onFilterSelected(ShelfFilter.READ)
            }
            StatusButton(
                text = ReadingStatus.WISH_LIST.value,
                selected = selectedFilter == ShelfFilter.WISH_LIST
            ){
                onFilterSelected(ShelfFilter.WISH_LIST)
            }
            StatusButton(
                text = ReadingStatus.READING.value,
                selected = selectedFilter == ShelfFilter.READING
            ){
                onFilterSelected(ShelfFilter.READING)
            }
        }
    }
}

@Preview
@Composable
fun ReadingFilterPreview(){
    var selectedFilter by rememberSaveable {
        mutableStateOf(ShelfFilter.ALL)
    }

    Scaffold (modifier = Modifier.fillMaxSize()) { innerPadding ->
        ShelfStatusFilter(
            selectedFilter =  selectedFilter,
            onFilterSelected = {selectedFilter = it },
            modifier = Modifier.padding(innerPadding)
        )
    }
}