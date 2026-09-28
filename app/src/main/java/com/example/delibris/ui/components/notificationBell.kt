package com.example.delibris.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NotificationBell(
    notification: Int = 0
){
    IconButton(onClick = {

    }) {
        BadgedBox(
            badge = {
               if(notification > 0){
                   Badge(
                       modifier =
                           Modifier
                               .border(1.dp, color = Color.White, shape = CircleShape)
                   ){
                       if(notification > 99){
                           Text("99+")
                       } else{
                           Text("$notification")
                       }
                   }
               }
            }
        ) {

                Icon(
                    modifier = Modifier.size(25.dp),
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "Notification Bell")

        }
    }
}