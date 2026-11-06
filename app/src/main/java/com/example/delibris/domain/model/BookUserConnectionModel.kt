package com.example.delibris.domain.model

import com.example.delibris.core.common.ReadingStatus
import java.time.LocalDate

data class BookUserConnectionModel(
    val id: Int,
    val userId: Int,
    val bookId: Int,
    val status: ReadingStatus,
    val date: LocalDate = LocalDate.now()
)

