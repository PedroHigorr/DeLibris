package com.example.delibris.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.delibris.core.common.ReadingStatus
import com.example.delibris.ui.theme.Navy
import com.example.delibris.ui.theme.NavyLight
import com.example.delibris.ui.theme.NavyMedium
import com.example.delibris.ui.theme.ReadColor
import com.example.delibris.ui.theme.ReadingColor
import com.example.delibris.ui.theme.Sage
import com.example.delibris.ui.theme.SageLight
import com.example.delibris.ui.theme.SageMedium
import com.example.delibris.ui.theme.Terracotta
import com.example.delibris.ui.theme.TerracottaLight
import com.example.delibris.ui.theme.TerracottaMedium
import com.example.delibris.ui.theme.WishColor

@Composable
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


@Composable
fun backgroundForStatusColor(
    status: ReadingStatus
): Color{
    val color = when(status){
        ReadingStatus.READ -> TerracottaLight
        ReadingStatus.READING -> NavyLight
        ReadingStatus.WISH_LIST -> SageLight
    }

    return color
}


fun avatarBorderStatusColor(
    status: ReadingStatus
): Color{
    val color = when(status){
        ReadingStatus.READ -> ReadColor
        ReadingStatus.READING -> ReadingColor
        ReadingStatus.WISH_LIST -> WishColor
    }

    return color
}