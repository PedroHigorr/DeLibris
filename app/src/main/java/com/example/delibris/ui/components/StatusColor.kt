package com.example.delibris.ui.components

import androidx.compose.ui.graphics.Color
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.ui.theme.ReadColor
import com.example.delibris.ui.theme.ReadLight
import com.example.delibris.ui.theme.ReadingColor
import com.example.delibris.ui.theme.ReadingLight
import com.example.delibris.ui.theme.WishColor
import com.example.delibris.ui.theme.WishLight

fun statusColor(
    status: ReadingStatus
): Color {
    val color =     when(status){
        ReadingStatus.READ -> ReadColor
        ReadingStatus.READING -> ReadingColor
        ReadingStatus.WISH_LIST -> WishColor
    }

    return color
}



fun backgroundForStatusColor(
    status: ReadingStatus
): Color{
    val color = when(status){
        ReadingStatus.READ -> ReadLight
        ReadingStatus.READING -> ReadingLight
        ReadingStatus.WISH_LIST -> WishLight
    }

    return color
}


