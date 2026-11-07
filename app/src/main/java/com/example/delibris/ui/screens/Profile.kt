package com.example.delibris.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.delibris.ui.theme.Ivory

@Composable
fun Profile(){

    Box(
        modifier = Modifier.fillMaxSize().background(Ivory)
    ){
        Text("Perfil")
    }

}