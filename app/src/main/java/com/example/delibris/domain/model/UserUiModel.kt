package com.example.delibris.domain.model

import androidx.annotation.DrawableRes
import com.example.delibris.R

data class UserUiModel(

    val id: Int,
    val name: String,
    @DrawableRes val image: Int?,
)
