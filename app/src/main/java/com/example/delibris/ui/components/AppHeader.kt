package com.example.delibris.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.delibris.R

@Composable
fun AppHeader(
    modifier: Modifier = Modifier,
    action: (@Composable () -> Unit)? = null

){
    Box(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(top = 25.dp).align(Alignment.Center),
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.SemiBold,
            text = stringResource(R.string.app_name))

        if(action != null){
            Box(modifier = Modifier.align(Alignment.CenterEnd).padding(end = 25.dp)){
                action()
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun TittlePreview(){
//    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//        Tittle(modifier = Modifier.padding(innerPadding))
//        {
//            NotificationBell(200)
//        }
//    }
//}