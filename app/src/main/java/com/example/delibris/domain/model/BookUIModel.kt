package com.example.delibris.domain.model

import coil3.compose.AsyncImage
import com.example.delibris.core.common.ReadingStatus
data class BookUIModel(
    val id: Int,
    val tittle: String,
    val author: String,
    val coverUrl: String?,
)


