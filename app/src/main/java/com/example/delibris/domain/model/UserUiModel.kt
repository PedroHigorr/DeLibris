package com.example.delibris.domain.model

import androidx.annotation.DrawableRes
import com.example.delibris.R

data class UserUiModel(

    val id: Int,
    val name: String,
    @DrawableRes val image: Int?,
)

object MockUserUi{

    val user1 = UserUiModel(
        id = 1,
        name = "Pedro Higor",
        image = R.drawable.avatar_pedro
    )

    val user2 = UserUiModel(
        id = 2,
        name = "Priscila Pereira",
        image = R.drawable.avatar_pri
    )

    val user3 = UserUiModel(
        id = 3,
        name = "Ketrim Calcing",
        image = R.drawable.avatar_ketrim
    )

    val user4 = UserUiModel(
        id = 4,
        name = "Strange Man",
        image = R.drawable.avatar_man
    )


    val user5 = UserUiModel(
        id = 5,
        name = "Random Guy",
        image = null
    )

    val user6 = UserUiModel(
        id = 6,
        name = "Random Girl",
        image = null
        )

    val userList = listOf(
        user1,
        user2,
        user3,
        user4,
        user5,
        user6
    )
}