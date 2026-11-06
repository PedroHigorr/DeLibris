package com.example.delibris.ui.components

import android.graphics.drawable.Drawable
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.delibris.R
import com.example.delibris.core.common.MainTab
import com.example.delibris.ui.theme.Ivory
import com.example.delibris.ui.theme.IvorySurface
import com.example.delibris.ui.theme.OutlineSoft
import com.example.delibris.ui.theme.Sage
import com.example.delibris.ui.theme.Terracotta

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    selectedTab: MainTab,
    onTabClick: (MainTab) -> Unit
) {
    Box(
        modifier = modifier
            .background(Color.Transparent)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .dropShadow(
                    shape = RoundedCornerShape(10.dp),
                    shadow = Shadow(
                        radius = 6.dp,
                        color = Color.Black.copy(alpha = 0.15f),
                        offset = DpOffset(x = 0.dp, y = 1.dp),
                        spread = 0.dp
                    )
                )
                .background(
                    color = IvorySurface,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(
                    horizontal = 20.dp,
                    vertical = 15.dp
                )
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable(onClick = { onTabClick(MainTab.HOME) }),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val selected = selectedTab == MainTab.HOME
                Icon(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "Início",
                    color = Terracotta
                )

                Spacer(modifier = Modifier.height(6.dp))
                Box(
                    modifier = Modifier
                        .width(28.dp)
                        .height(3.dp)
                        .background(
                            color = if (selected) Terracotta else Color.Transparent,
                            shape = RoundedCornerShape(25.dp)
                        )
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable(onClick = { onTabClick(MainTab.COLLECTIONS) }),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val selected = selectedTab == MainTab.COLLECTIONS

                Icon(
                    painter = painterResource(R.drawable.library),
                    contentDescription = "Library",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "Biblioteca",
                    color = Sage
                )

                Spacer(modifier = Modifier.height(6.dp))
                Box(
                    modifier = Modifier
                        .width(28.dp)
                        .height(3.dp)
                        .background(
                            color = if (selected) Sage else Color.Transparent,
                            shape = RoundedCornerShape(25.dp)
                        )
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable(onClick = { onTabClick(MainTab.FRIENDS) }),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val selected = selectedTab == MainTab.FRIENDS

                Icon(
                    painter = painterResource(R.drawable.group),
                    contentDescription = "Friends",
                    tint = Color(0xFF72828A),
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "Amigos",
                    color = Color(0xFF72828A)
                )
                Spacer(modifier = Modifier.height(6.dp))
                Box(
                    modifier = Modifier
                        .width(28.dp)
                        .height(3.dp)
                        .background(
                            color = if (selected) Color(0xFF72828A) else Color.Transparent,
                            shape = RoundedCornerShape(25.dp)
                        )
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable(onClick = { onTabClick(MainTab.PROFILE) }),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val selected = selectedTab == MainTab.PROFILE

                Icon(
                    painter = painterResource(R.drawable.person),
                    contentDescription = "Perfil",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "Perfil",
                    color = Sage
                )

                Box(
                    modifier = Modifier
                        .width(28.dp)
                        .height(3.dp)
                        .background(
                            color = if (selected) Sage else Color.Transparent,
                            shape = RoundedCornerShape(25.dp)
                        )
                )
            }
        }
    }
}

@Preview
@Composable
fun NavBarPreview() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavigationBar(
            modifier = Modifier.padding(innerPadding),
            selectedTab = MainTab.PROFILE
        ) {}
    }
}