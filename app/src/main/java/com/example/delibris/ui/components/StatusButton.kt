package com.example.delibris.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.delibris.ui.theme.Ivory
import com.example.delibris.ui.theme.Navy
import com.example.delibris.ui.theme.Terracotta

@Composable
fun StatusButton(
    text: String,
    selected: Boolean,
    onClick: () -> Unit
){


    FilterChip(
        selected = selected,
        shape = RoundedCornerShape(50),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Terracotta,
            selectedLabelColor = Color.White,
            containerColor = Ivory,
            labelColor = Navy
        ),
        onClick = {
            onClick()
        },
        label = {Text(text)}
    )

}