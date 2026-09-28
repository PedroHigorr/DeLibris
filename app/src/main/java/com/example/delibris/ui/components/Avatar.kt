package com.example.delibris.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.delibris.R
import com.example.delibris.domain.model.MockUserUi
import com.example.delibris.ui.theme.Navy

@Composable
fun Avatar(
    id: Int,
    modifier: Modifier = Modifier,
    color: Color = Navy
){

    val user = MockUserUi.userList.firstOrNull(){ it.id == id}

    if(user?.image != null){
        Image(
            painter = painterResource(id = user.image),
            contentDescription = null,
            modifier = modifier
                .clip(CircleShape)
                .size(30.dp)
                .border(
                    width = 2.dp,
                    color = color,
                    shape = CircleShape
                ),
            contentScale = ContentScale.Crop
        )
    }else{
        Image(
            painter = painterResource(id = R.drawable.usericon),
            contentDescription = null,
            modifier = modifier
                .clip(CircleShape)
                .size(30.dp)
                .border(
                    width = 2.dp,
                    color = color,
                    shape = CircleShape
                )
                .background(Color.Gray),
            contentScale = ContentScale.Crop
        )
    }


}

//@Preview(showBackground = true)
//@Composable
//fun AvatarPreview(){
//    val images = listOf(
//        R.drawable.avatar_pedro,
//        R.drawable.avatar_pri,
//        R.drawable.avatar_man
//    )
//    Surface(modifier = Modifier.fillMaxSize()) {
//
//        Box(modifier = Modifier.fillMaxSize()) {
//
//               Avatar(
//                   id = 5,
//                   color = Sage
//               )
//            }
//        }
//}

