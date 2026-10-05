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

object MockUserBookConnections{

    //User1

    val usr1b1 = BookUserConnectionModel(
        id = 1,
        userId = 1,
        bookId = 1,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 6, 18)
    )
    val usr1b2 = BookUserConnectionModel(
        id = 2,
        userId = 1,
        bookId = 2,
        status = ReadingStatus.READING,
        date = LocalDate.of(2025, 2, 28)
    )
    val usr1b3 = BookUserConnectionModel(
        id = 3,
        userId = 1,
        bookId = 3,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2026, 4, 6)
    )
    val usr1b4 = BookUserConnectionModel(
        id = 4,
        userId = 1,
        bookId = 4,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 11, 6)

    )
    val usr1b5 = BookUserConnectionModel(
        id = 5,
        userId = 1,
        bookId = 5,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 9, 10)

    )
    val usr1b6 = BookUserConnectionModel(
        id = 6,
        userId = 1,
        bookId = 6,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2025, 1, 9)

    )
    val usr1b7 = BookUserConnectionModel(
        id = 7,
        userId = 1,
        bookId = 7,
        status = ReadingStatus.READING,
        date = LocalDate.of(2024, 10, 23)

    )
    val usr1b8 = BookUserConnectionModel(
        id = 8,
        userId = 1,
        bookId = 8,
        status = ReadingStatus.READING,
        date = LocalDate.of(2024, 6, 27)

    )
    val usr1b9 = BookUserConnectionModel(
        id = 9,
        userId = 1,
        bookId = 9,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 2, 23)

    )

    val usr1b10 = BookUserConnectionModel(
        id = 10,
        userId = 1,
        bookId = 10,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 12, 23)

    )
    val usr1b11 = BookUserConnectionModel(
        id = 11,
        userId = 1,
        bookId = 11,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 12, 22)

    )
    val usr1b12 = BookUserConnectionModel(
        id = 12,
        userId = 1,
        bookId = 12,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2025, 7, 7)

    )
    val usr1b13 = BookUserConnectionModel(
        id = 13,
        userId = 1,
        bookId = 13,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2025, 11, 8)

    )
    val usr1b14 = BookUserConnectionModel(
        id = 14,
        userId = 1,
        bookId = 14,
        status = ReadingStatus.READING,
        date = LocalDate.of(2024, 10, 11)

    )
    val usr1b15 = BookUserConnectionModel(
        id = 15,
        userId = 1,
        bookId = 15,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 4, 22)

    )


    //User 2


    val usr2b1 = BookUserConnectionModel(
        id = 16,
        userId = 2,
        bookId = 1,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2026, 7, 28)

    )
    val usr2b2 = BookUserConnectionModel(
        id = 17,
        userId = 2,
        bookId = 2,
        status = ReadingStatus.READING,
        date = LocalDate.of(2024, 1, 28)

    )
    val usr2b3 = BookUserConnectionModel(
        id = 18,
        userId = 2,
        bookId = 3,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 9, 11)

    )
    val usr2b4 = BookUserConnectionModel(
        id = 19,
        userId = 2,
        bookId = 4,
        status = ReadingStatus.READING,
        date = LocalDate.of(2025, 1, 28)

    )
    val usr2b5 = BookUserConnectionModel(
        id = 20,
        userId = 2,
        bookId = 5,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 4, 14)

    )
    val usr2b7 = BookUserConnectionModel(
        id = 21,
        userId = 2,
        bookId = 7,
        status = ReadingStatus.READING,
        date = LocalDate.of(2026, 2, 3)

    )
    val usr2b8 = BookUserConnectionModel(
        id = 22,
        userId = 2,
        bookId = 8,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 3, 5)

    )
    val usr2b9 = BookUserConnectionModel(
        id = 23,
        userId = 2,
        bookId = 9,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2024, 9, 15)

    )
    val usr2b10 = BookUserConnectionModel(
        id = 24,
        userId = 2,
        bookId = 10,
        status = ReadingStatus.READING,
        date = LocalDate.of(2026, 5, 30)

    )
    val usr2b11 = BookUserConnectionModel(
        id = 25,
        userId = 2,
        bookId = 11,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2025, 5, 28)

    )

    //User 3

    val usr3b1 = BookUserConnectionModel(
        id = 26,
        userId = 3,
        bookId = 1,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2026, 4, 1)

    )
    val usr3b2 = BookUserConnectionModel(
        id = 27,
        userId = 3,
        bookId = 2,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 11, 21)

    )
    val usr3b3 = BookUserConnectionModel(
        id = 28,
        userId = 3,
        bookId = 3,
        status = ReadingStatus.READING,
        date = LocalDate.of(2025, 10, 17)

    )
    val usr3b4 = BookUserConnectionModel(
        id = 29,
        userId = 3,
        bookId = 4,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 5, 16)

    )
    val usr3b5 = BookUserConnectionModel(
        id = 30,
        userId = 3,
        bookId = 5,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 12, 1)

    )
    val usr3b6 = BookUserConnectionModel(
        id = 31,
        userId = 3,
        bookId = 6,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 8, 25)

    )
    val usr3b7 = BookUserConnectionModel(
        id = 32,
        userId = 3,
        bookId = 7,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 1, 11)

    )
    val usr3b10 = BookUserConnectionModel(
        id = 33,
        userId = 3,
        bookId = 10,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 2, 15)

    )
    val usr3b13 = BookUserConnectionModel(
        id = 34,
        userId = 3,
        bookId = 13,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 5, 20)

    )
    val usr3b14 = BookUserConnectionModel(
        id = 35,
        userId = 3,
        bookId = 14,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 7, 18)

    )

    //User 4


    val usr4b1 = BookUserConnectionModel(
        id = 36,
        userId = 4,
        bookId = 1,
        status = ReadingStatus.READING,
        date = LocalDate.of(2024, 3, 4)

    )
    val usr4b2 = BookUserConnectionModel(
        id = 37,
        userId = 4,
        bookId = 2,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 5, 23)

    )
    val usr4b3 = BookUserConnectionModel(
        id = 38,
        userId = 4,
        bookId = 3,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2026, 4, 12)

    )
    val usr4b4 = BookUserConnectionModel(
        id = 39,
        userId = 4,
        bookId = 4,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 4, 12)

    )
    val usr4b5 = BookUserConnectionModel(
        id = 40,
        userId = 4,
        bookId = 5,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2026, 3, 21)

    )
    val usr4b6 = BookUserConnectionModel(
        id = 41,
        userId = 4,
        bookId = 6,
        status = ReadingStatus.READING,
        date = LocalDate.of(2026, 6, 15)

    )
    val usr4b13 = BookUserConnectionModel(
        id = 42,
        userId = 4,
        bookId = 13,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2024, 7, 20)

    )
    val usr4b14 = BookUserConnectionModel(
        id = 43,
        userId = 4,
        bookId = 14,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 6, 3)

    )
    val usr4b15 = BookUserConnectionModel(
        id = 44,
        userId = 4,
        bookId = 15,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2026, 6, 22)

    )

//    User 5

    val usr5b1 = BookUserConnectionModel(
        id = 45,
        userId = 5,
        bookId = 1,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 12, 23)

    )
    val usr5b2 = BookUserConnectionModel(
        id = 46,
        userId = 5,
        bookId = 2,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 6, 29)

    )
    val usr5b3 = BookUserConnectionModel(
        id = 47,
        userId = 5,
        bookId = 3,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 7, 26)

    )
    val usr5b4 = BookUserConnectionModel(
        id = 48,
        userId = 5,
        bookId = 4,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 4, 1)

    )
    val usr5b6 = BookUserConnectionModel(
        id = 49,
        userId = 5,
        bookId = 6,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 9, 5)

    )
    val usr5b7 = BookUserConnectionModel(
        id = 50,
        userId = 5,
        bookId = 7,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 12, 3)

    )
    val usr5b15 = BookUserConnectionModel(
        id = 51,
        userId = 5,
        bookId = 15,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 8, 3)

    )
    val usr5b14 = BookUserConnectionModel(
        id = 52,
        userId = 5,
        bookId = 14,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 12, 4)

    )
    val usr5b13 = BookUserConnectionModel(
        id = 53,
        userId = 5,
        bookId = 13,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 7, 6)

    )

    //User 6


//    val usr6b1 = BookUserConnectionModel(
//        userId = 6,
//        bookId = 1,
//        status = ReadingStatus.READ
//    )
    val usr6b2 = BookUserConnectionModel(
        id = 54,
        userId = 6,
        bookId = 2,
        status = ReadingStatus.WISH_LIST,
    date = LocalDate.of(2024, 5, 6)

)
    val usr6b3 = BookUserConnectionModel(
        id = 55,
        userId = 6,
        bookId = 3,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2026, 6, 22)

    )
    val usr6b4 = BookUserConnectionModel(
        id = 56,
        userId = 6,
        bookId = 4,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 1, 2)

    )
    val usr6b5 = BookUserConnectionModel(
        id = 57,
        userId = 6,
        bookId = 5,
        status = ReadingStatus.READING,
        date = LocalDate.of(2025, 10, 16)

    )
    val usr6b6 = BookUserConnectionModel(
        id = 58,
        userId = 6,
        bookId = 6,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 3, 11)

    )
    val usr6b7 = BookUserConnectionModel(
        id = 59,
        userId = 6,
        bookId = 7,
        status = ReadingStatus.READ,
        date = LocalDate.of(2024, 11, 12)

    )
    val usr6b8 = BookUserConnectionModel(
        id = 60,
        userId = 6,
        bookId = 8,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2024, 11, 12)

    )
    val usr6b9 = BookUserConnectionModel(
        id = 61,
        userId = 6,
        bookId = 9,
        status = ReadingStatus.WISH_LIST,
        date = LocalDate.of(2025, 2, 23)
    )
    val usr6b10 = BookUserConnectionModel(
        id = 62,
        userId = 6,
        bookId = 10,
        status = ReadingStatus.READ,
        date = LocalDate.of(2026, 4, 6)

    )
    val usr6b11 = BookUserConnectionModel(
        id = 63,
        userId = 6,
        bookId = 11,
        status = ReadingStatus.READING,
        date = LocalDate.of(2025, 11, 8)

    )
    val usr6b12 = BookUserConnectionModel(
        id = 64,
        userId = 6,
        bookId = 12,
        status = ReadingStatus.READING,
        date = LocalDate.of(2025, 11, 8)

    )
    val usr6b13 = BookUserConnectionModel(
        id = 65,
        userId = 6,
        bookId = 13,
        status = ReadingStatus.READ,
        date = LocalDate.of(2025, 7, 26)

    )

    val usersBookConnections = listOf(
        usr1b1,
        usr1b2,
        usr1b3,
        usr1b4,
        usr1b5,
        usr1b6,
        usr1b7,
        usr1b8,
        usr1b9,
        usr1b10,
        usr1b11,
        usr1b12,
        usr1b13,
        usr1b14,
        usr1b15,
        usr2b1,
        usr2b2,
        usr2b3,
        usr2b4,
        usr2b5,
        usr2b7,
        usr2b8,
        usr2b9,
        usr2b10,
        usr2b11,
        usr3b1,
        usr3b2,
        usr3b3,
        usr3b4,
        usr3b5,
        usr3b6,
        usr3b7,
        usr3b10,
        usr3b13,
        usr3b14,
        usr4b1,
        usr4b2,
        usr4b3,
        usr4b4,
        usr4b5,
        usr4b6,
        usr4b13,
        usr4b14,
        usr4b15,
        usr5b1,
        usr5b2,
        usr5b3,
        usr5b4,
        usr5b6,
        usr5b7,
        usr5b13,
        usr5b14,
        usr5b15,
//        usr6b1,
        usr6b2,
        usr6b3,
        usr6b4,
        usr6b5,
        usr6b6,
        usr6b7,
        usr6b8,
        usr6b9,
        usr6b10,
        usr6b11,
        usr6b12,
        usr6b13,

    )
}