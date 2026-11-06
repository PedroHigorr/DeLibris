package com.example.delibris

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay

import com.example.delibris.ui.navigation.DeLibrisNavigation
import com.example.delibris.ui.screens.Book
import com.example.delibris.ui.screens.Friends
import com.example.delibris.ui.screens.Home
import com.example.delibris.ui.theme.DeLibrisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
                DeLibrisNavigation()
        }
    }
}

