package com.example.delibris.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.delibris.core.common.ReadingStatus

@Composable
fun Status(
    status: ReadingStatus,
    modifier: Modifier = Modifier
){
    Box(
        contentAlignment = Alignment.Center,
        modifier =
            modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = backgroundForStatusColor(status))
                .padding(
                    horizontal = 8.dp,
                    vertical = 2.dp
                )
    ) {
        Text(

            text = status.value,
            color = statusColor(status),
            fontSize = 10.sp,
            lineHeight = 8.sp,
            fontWeight = FontWeight.ExtraBold,
            )
    }
}

//@Preview
//@Composable
//fun StatusPreview(){
//    Scaffold(modifier = Modifier.fillMaxWidth()) { innerPadding ->
//        Status(ReadingStatus.WISH_LIST, modifier = Modifier.padding(innerPadding))
//    }
//}