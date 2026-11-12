package com.example.delibris.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.ui.theme.Terracotta

@Composable
fun SeeMoreButton(
    onSeeMoreClick: () -> Unit,
    modifier: Modifier = Modifier
){

    OutlinedButton(
        onClick = onSeeMoreClick,
        modifier = modifier,
        border = BorderStroke(1.dp, Terracotta),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(
            horizontal = 12.dp,
            vertical = 8.dp
        ),
    ) {
        Text(
            text = "Ver mais",
            color = Terracotta
            )
        Spacer(Modifier.width(4.dp))
        Icon(
            modifier = Modifier.size(20.dp),
            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = null,
            tint = Terracotta
        )
    }

}


@Preview
@Composable
fun SeeMoreButtonPreview() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        Box(modifier = Modifier.padding(innerPadding)) {

            SeeMoreButton(
                onSeeMoreClick = {}
            )
        }
    }
}
