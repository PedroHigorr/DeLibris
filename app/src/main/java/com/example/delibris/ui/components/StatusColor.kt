package com.example.delibris.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.ui.theme.Navy
import com.example.delibris.ui.theme.Sage
import com.example.delibris.ui.theme.Terracotta

@Composable
fun statusColor(
    status: ReadingStatus
): Color {
    val color =     when(status){
        ReadingStatus.READ -> Terracotta
        ReadingStatus.READING -> Navy
        ReadingStatus.WISH_LIST -> Sage
    }

    return color
}


@Composable
fun bbColor(){}