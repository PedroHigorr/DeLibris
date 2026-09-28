package com.example.delibris.domain.model

import coil3.compose.AsyncImage
import com.example.delibris.core.common.ReadingStatus
data class BookUIModel(
    val id: Int,
    val tittle: String,
    val author: String,
    val coverUrl: String?,
)


object MockBooks{
    val book1 = BookUIModel(
        id = 1,
        tittle = "O Estrangeiro",
        author = "Albert Camus",
        coverUrl = "https://ia600505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_57.zip&file=0014573710-L.jpg",
    )

    val book2 = BookUIModel(
        id = 2,
        tittle = "Crime e Castigo",
        author = "Fiódor Dostoiévski",
        coverUrl = "https://ia600505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_63.zip&file=0014630368-L.jpg",
    )
    val book3 = BookUIModel(
        id = 3,
        tittle = "Os Irmão Karamazov",
        author = "Fiódor Dostoiévski",
        coverUrl = "https://covers.openlibrary.org/b/id/15167288-L.jpg",
    )
    val book4 = BookUIModel(
        id = 4,
        tittle = "O Mito de Sísifo",
        author = "Albert Camus",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_57.zip&file=0014573728-L.jpg",
    )
    val book5 = BookUIModel(
        id = 5,
        tittle = "A Queda",
        author = "Albert Camus",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_64.zip&file=0014646982-L.jpg",
    )
    val book6 = BookUIModel(
        id = 6,
        tittle = "A Divina Comédia",
        author = "Dante Alighieri",
        coverUrl = "https://covers.openlibrary.org/b/id/15135707-L.jpg",
    )
    val book7 = BookUIModel(
        id = 7,
        tittle = "Illíada",
        author = "Homero",
        coverUrl = "https://ia800100.us.archive.org/view_archive.php?archive=/5/items/l_covers_0012/l_covers_0012_33.zip&file=0012339422-L.jpg",
    )
    val book8 = BookUIModel(
        id = 8,
        tittle = "A Odisséia",
        author = "Homero",
        coverUrl = "https://ia800404.us.archive.org/view_archive.php?archive=/33/items/l_covers_0010/l_covers_0010_57.zip&file=0010570452-L.jpg",
    )
    val book9 = BookUIModel(
        id = 9,
        tittle = "Confissões",
        author = "Agostinho de Hipona",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_59.zip&file=0014595615-L.jpg",
    )
    val book10 = BookUIModel(
        id = 10,
        tittle = "O Livro dos 5 Anéis",
        author = "Miyamoto Musashi",
        coverUrl = "https://ia801402.us.archive.org/view_archive.php?archive=/0/items/olcovers100/olcovers100-L.zip&file=1005169-L.jpg",
    )
    val book11 = BookUIModel(
        id = 11,
        tittle = "A guerra dos Tronos: As Crônicas de Gelo e Fogo, volume 1",
        author = "George R. R. Martin",
        coverUrl = "https://covers.openlibrary.org/b/id/15139462-L.jpg",
    )

    val book12 = BookUIModel(
        id = 12,
        tittle = "Eneida",
        author = "Vígilio",
        coverUrl = "https://ia601909.us.archive.org/view_archive.php?archive=/31/items/l_covers_0013/l_covers_0013_49.zip&file=0013499872-L.jpg",
    )

    val book13 = BookUIModel(
        id = 13,
        tittle = "A Metamorfose",
        author = "Fraz Kafka",
        coverUrl = "https://ia600507.us.archive.org/view_archive.php?archive=/8/items/l_covers_0009/l_covers_0009_22.zip&file=0009221228-L.jpg",
    )

    val book14 = BookUIModel(
        id = 14,
        tittle = "Vidas Secas",
        author = "Graciliano Ramos",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_61.zip&file=0014618961-L.jpg",
    )

    val book15 = BookUIModel(
        id = 15,
        tittle = "O Alquimista",
        author = "Paulo Coelho",
        coverUrl = "https://ia800100.us.archive.org/view_archive.php?archive=/5/items/l_covers_0012/l_covers_0012_37.zip&file=0012372777-L.jpg",
    )

    val books = listOf(
        book1,
        book2,
        book3,
        book4,
        book5,
        book6,
        book7,
        book8,
        book9,
        book10,
        book11,
        book12,
        book13,
        book14,
        book15
    )

//    val book = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
//
//    val book8 = BookUIModel(
//        id = 8,
//        tittle = "A Odisséia",
//        author = "Homero",
//        coverUrl = null,
//        status = ReadingStatus.READ
//    )
}