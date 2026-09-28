package com.example.delibris.domain.model

import com.example.delibris.core.common.ReadingStatus

data class BookUserConnectionModel(
    val userId: Int,
    val bookId: Int,
    val status: ReadingStatus
)

object MockUserBookConnections{

    //User1

    val usr1b1 = BookUserConnectionModel(
        userId = 1,
        bookId = 1,
        status = ReadingStatus.READ
    )
    val usr1b2 = BookUserConnectionModel(
        userId = 1,
        bookId = 2,
        status = ReadingStatus.READING
    )
    val usr1b3 = BookUserConnectionModel(
        userId = 1,
        bookId = 3,
        status = ReadingStatus.WISH_LIST
    )
    val usr1b4 = BookUserConnectionModel(
        userId = 1,
        bookId = 4,
        status = ReadingStatus.READ
    )
    val usr1b5 = BookUserConnectionModel(
        userId = 1,
        bookId = 5,
        status = ReadingStatus.READ
    )
    val usr1b6 = BookUserConnectionModel(
        userId = 1,
        bookId = 6,
        status = ReadingStatus.WISH_LIST
    )
    val usr1b7 = BookUserConnectionModel(
        userId = 1,
        bookId = 7,
        status = ReadingStatus.READING
    )
    val usr1b8 = BookUserConnectionModel(
        userId = 1,
        bookId = 8,
        status = ReadingStatus.READING
    )
    val usr1b9 = BookUserConnectionModel(
        userId = 1,
        bookId = 9,
        status = ReadingStatus.READ
    )

    val usr1b10 = BookUserConnectionModel(
        userId = 1,
        bookId = 10,
        status = ReadingStatus.READ
    )
    val usr1b11 = BookUserConnectionModel(
        userId = 1,
        bookId = 11,
        status = ReadingStatus.READ
    )
    val usr1b12 = BookUserConnectionModel(
        userId = 1,
        bookId = 12,
        status = ReadingStatus.WISH_LIST
    )
    val usr1b13 = BookUserConnectionModel(
        userId = 1,
        bookId = 13,
        status = ReadingStatus.WISH_LIST
    )
    val usr1b14 = BookUserConnectionModel(
        userId = 1,
        bookId = 14,
        status = ReadingStatus.READING
    )
    val usr1b15 = BookUserConnectionModel(
        userId = 1,
        bookId = 15,
        status = ReadingStatus.READ
    )


    //User 2


    val usr2b1 = BookUserConnectionModel(
        userId = 2,
        bookId = 1,
        status = ReadingStatus.WISH_LIST
    )
    val usr2b2 = BookUserConnectionModel(
        userId = 2,
        bookId = 2,
        status = ReadingStatus.READING
    )
    val usr2b3 = BookUserConnectionModel(
        userId = 2,
        bookId = 3,
        status = ReadingStatus.READ
    )
    val usr2b4 = BookUserConnectionModel(
        userId = 2,
        bookId = 4,
        status = ReadingStatus.READING
    )
    val usr2b5 = BookUserConnectionModel(
        userId = 2,
        bookId = 5,
        status = ReadingStatus.READ
    )
    val usr2b7 = BookUserConnectionModel(
        userId = 2,
        bookId = 7,
        status = ReadingStatus.READING
    )
    val usr2b8 = BookUserConnectionModel(
        userId = 2,
        bookId = 8,
        status = ReadingStatus.READ
    )
    val usr2b9 = BookUserConnectionModel(
        userId = 2,
        bookId = 9,
        status = ReadingStatus.WISH_LIST
    )
    val usr2b10 = BookUserConnectionModel(
        userId = 2,
        bookId = 10,
        status = ReadingStatus.READING
    )
    val usr2b11 = BookUserConnectionModel(
        userId = 2,
        bookId = 11,
        status = ReadingStatus.WISH_LIST
    )

    //User 3

    val usr3b1 = BookUserConnectionModel(
        userId = 3,
        bookId = 1,
        status = ReadingStatus.WISH_LIST
    )
    val usr3b2 = BookUserConnectionModel(
        userId = 3,
        bookId = 2,
        status = ReadingStatus.READ
    )
    val usr3b3 = BookUserConnectionModel(
        userId = 3,
        bookId = 3,
        status = ReadingStatus.READING
    )
    val usr3b4 = BookUserConnectionModel(
        userId = 3,
        bookId = 4,
        status = ReadingStatus.READ
    )
    val usr3b5 = BookUserConnectionModel(
        userId = 3,
        bookId = 5,
        status = ReadingStatus.READ
    )
    val usr3b6 = BookUserConnectionModel(
        userId = 3,
        bookId = 6,
        status = ReadingStatus.READ
    )
    val usr3b7 = BookUserConnectionModel(
        userId = 3,
        bookId = 7,
        status = ReadingStatus.READ
    )
    val usr3b10 = BookUserConnectionModel(
        userId = 3,
        bookId = 10,
        status = ReadingStatus.READ
    )
    val usr3b13 = BookUserConnectionModel(
        userId = 3,
        bookId = 13,
        status = ReadingStatus.READ
    )
    val usr3b14 = BookUserConnectionModel(
        userId = 3,
        bookId = 14,
        status = ReadingStatus.READ
    )

    //User 4


    val usr4b1 = BookUserConnectionModel(
        userId = 4,
        bookId = 1,
        status = ReadingStatus.READING
    )
    val usr4b2 = BookUserConnectionModel(
        userId = 4,
        bookId = 2,
        status = ReadingStatus.READ
    )
    val usr4b3 = BookUserConnectionModel(
        userId = 4,
        bookId = 3,
        status = ReadingStatus.WISH_LIST
    )
    val usr4b4 = BookUserConnectionModel(
        userId = 4,
        bookId = 4,
        status = ReadingStatus.READ
    )
    val usr4b5 = BookUserConnectionModel(
        userId = 4,
        bookId = 5,
        status = ReadingStatus.WISH_LIST
    )
    val usr4b6 = BookUserConnectionModel(
        userId = 4,
        bookId = 6,
        status = ReadingStatus.READING
    )
    val usr4b13 = BookUserConnectionModel(
        userId = 4,
        bookId = 13,
        status = ReadingStatus.WISH_LIST
    )
    val usr4b14 = BookUserConnectionModel(
        userId = 4,
        bookId = 14,
        status = ReadingStatus.READ
    )
    val usr4b15 = BookUserConnectionModel(
        userId = 4,
        bookId = 15,
        status = ReadingStatus.WISH_LIST
    )

//    User 5

    val usr5b1 = BookUserConnectionModel(
        userId = 5,
        bookId = 1,
        status = ReadingStatus.READ
    )
    val usr5b2 = BookUserConnectionModel(
        userId = 5,
        bookId = 2,
        status = ReadingStatus.READ
    )
    val usr5b3 = BookUserConnectionModel(
        userId = 5,
        bookId = 3,
        status = ReadingStatus.READ
    )
    val usr5b4 = BookUserConnectionModel(
        userId = 5,
        bookId = 4,
        status = ReadingStatus.READ
    )
    val usr5b6 = BookUserConnectionModel(
        userId = 5,
        bookId = 6,
        status = ReadingStatus.READ
    )
    val usr5b7 = BookUserConnectionModel(
        userId = 5,
        bookId = 7,
        status = ReadingStatus.READ
    )
    val usr5b15 = BookUserConnectionModel(
        userId = 5,
        bookId = 15,
        status = ReadingStatus.READ
    )
    val usr5b14 = BookUserConnectionModel(
        userId = 5,
        bookId = 14,
        status = ReadingStatus.READ
    )
    val usr5b13 = BookUserConnectionModel(
        userId = 5,
        bookId = 13,
        status = ReadingStatus.READ
    )

    //User 6


//    val usr6b1 = BookUserConnectionModel(
//        userId = 6,
//        bookId = 1,
//        status = ReadingStatus.READ
//    )
    val usr6b2 = BookUserConnectionModel(
        userId = 6,
        bookId = 2,
        status = ReadingStatus.WISH_LIST
    )
    val usr6b3 = BookUserConnectionModel(
        userId = 6,
        bookId = 3,
        status = ReadingStatus.WISH_LIST
    )
    val usr6b4 = BookUserConnectionModel(
        userId = 6,
        bookId = 4,
        status = ReadingStatus.READ
    )
    val usr6b5 = BookUserConnectionModel(
        userId = 6,
        bookId = 5,
        status = ReadingStatus.READING
    )
    val usr6b6 = BookUserConnectionModel(
        userId = 6,
        bookId = 6,
        status = ReadingStatus.READ
    )
    val usr6b7 = BookUserConnectionModel(
        userId = 6,
        bookId = 7,
        status = ReadingStatus.READ
    )
    val usr6b8 = BookUserConnectionModel(
        userId = 6,
        bookId = 8,
        status = ReadingStatus.WISH_LIST
    )
    val usr6b9 = BookUserConnectionModel(
        userId = 6,
        bookId = 9,
        status = ReadingStatus.WISH_LIST
    )
    val usr6b10 = BookUserConnectionModel(
        userId = 6,
        bookId = 10,
        status = ReadingStatus.READ
    )
    val usr6b11 = BookUserConnectionModel(
        userId = 6,
        bookId = 11,
        status = ReadingStatus.READING
    )
    val usr6b12 = BookUserConnectionModel(
        userId = 6,
        bookId = 12,
        status = ReadingStatus.READING
    )
    val usr6b13 = BookUserConnectionModel(
        userId = 6,
        bookId = 13,
        status = ReadingStatus.READ
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