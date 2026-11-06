package com.example.delibris.ui.components



import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.delibris.domain.model.BookUserConnectionModel
import com.example.delibris.sample.MockBookUserConCon


@Composable
fun AvatarStack(
    users: List<BookUserConnectionModel>,
    modifier: Modifier = Modifier,
    onAvatarClick: () -> Unit
){

    val visibleUsers = users.shuffled().take(3)

    val remaining = users.size - visibleUsers.size

    Row(
        modifier = modifier.clickable(
            onClick = onAvatarClick
        ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(modifier = Modifier.width(65.dp)){

            visibleUsers.forEachIndexed { index, users ->

                Avatar(id = users.userId, color = statusColor(users.status), modifier = Modifier.offset( x = (index * 15).dp, y = 0.dp ))

            }
        }

        if(remaining > 0){
            Text(
                text = "+${remaining}",
                textDecoration = TextDecoration.Underline)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AvatarStackPreview(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding).fillMaxSize()){
            val users = MockBookUserConCon.usersBookConnections.filter { it.bookId == 1 }
            AvatarStack(users = users) {}
        }
    }
}