package com.example.delibris.sample

import com.example.delibris.domain.model.BookUIModel

// Edições, tradutores e ISBNs abaixo são ilustrativos para desenvolvimento.
object MockBooks{
    val book1 = BookUIModel(
        id = 1,
        pageNumbers = 184,
        edition = "Edição de colecionador",
        language = "Português",
        translator = "Jonas B. Right",
        isbn = "MOCK-ISBN-0001",
        tittle = "O Estrangeiro",
        author = "Albert Camus",
        coverUrl = "https://ia600505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_57.zip&file=0014573710-L.jpg",
    )

    val book2 = BookUIModel(
        id = 2,
        pageNumbers = 592,
        edition = "Edição de luxo",
        language = "Português",
        translator = "José Godofredo de Almeida",
        isbn = "MOCK-ISBN-0002",
        tittle = "Crime e Castigo",
        author = "Fiódor Dostoiévski",
        coverUrl = "https://ia600505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_63.zip&file=0014630368-L.jpg",
    )
    val book3 = BookUIModel(
        id = 3,
        pageNumbers = 896,
        edition = "Edição comentada",
        language = "Português",
        translator = "Helena Duarte",
        isbn = "MOCK-ISBN-0003",
        tittle = "Os Irmão Karamazov",
        author = "Fiódor Dostoiévski",
        coverUrl = "https://covers.openlibrary.org/b/id/15167288-L.jpg",
    )
    val book4 = BookUIModel(
        id = 4,
        pageNumbers = 224,
        edition = "Edição de bolso",
        language = "Português",
        translator = "Marcos A. Valença",
        isbn = "MOCK-ISBN-0004",
        tittle = "O Mito de Sísifo",
        author = "Albert Camus",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_57.zip&file=0014573728-L.jpg",
    )
    val book5 = BookUIModel(
        id = 5,
        pageNumbers = 160,
        edition = "Edição de verão",
        language = "Português",
        translator = "Beatriz Montenegro",
        isbn = "MOCK-ISBN-0005",
        tittle = "A Queda",
        author = "Albert Camus",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_64.zip&file=0014646982-L.jpg",
    )
    val book6 = BookUIModel(
        id = 6,
        pageNumbers = 720,
        edition = "Edição ilustrada",
        language = "Português",
        translator = "Augusto Bellini",
        isbn = "MOCK-ISBN-0006",
        tittle = "A Divina Comédia",
        author = "Dante Alighieri",
        coverUrl = "https://covers.openlibrary.org/b/id/15135707-L.jpg",
    )
    val book7 = BookUIModel(
        id = 7,
        pageNumbers = 544,
        edition = "Edição clássica",
        language = "Português",
        translator = "Clara Vasconcelos",
        isbn = "MOCK-ISBN-0007",
        tittle = "Illíada",
        author = "Homero",
        coverUrl = "https://ia800100.us.archive.org/view_archive.php?archive=/5/items/l_covers_0012/l_covers_0012_33.zip&file=0012339422-L.jpg",
    )
    val book8 = BookUIModel(
        id = 8,
        pageNumbers = 416,
        edition = "Edição especial",
        language = "Português",
        translator = "Tomás de Azevedo",
        isbn = "MOCK-ISBN-0008",
        tittle = "A Odisséia",
        author = "Homero",
        coverUrl = "https://ia800404.us.archive.org/view_archive.php?archive=/33/items/l_covers_0010/l_covers_0010_57.zip&file=0010570452-L.jpg",
    )
    val book9 = BookUIModel(
        id = 9,
        pageNumbers = 368,
        edition = "Edição integral",
        language = "Português",
        translator = "Cecília Amaral",
        isbn = "MOCK-ISBN-0009",
        tittle = "Confissões",
        author = "Agostinho de Hipona",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_59.zip&file=0014595615-L.jpg",
    )
    val book10 = BookUIModel(
        id = 10,
        pageNumbers = 128,
        edition = "Edição comemorativa",
        language = "Português",
        translator = "Ricardo Matsuda",
        isbn = "MOCK-ISBN-0010",
        tittle = "O Livro dos 5 Anéis",
        author = "Miyamoto Musashi",
        coverUrl = "https://ia801402.us.archive.org/view_archive.php?archive=/0/items/olcovers100/olcovers100-L.zip&file=1005169-L.jpg",
    )
    val book11 = BookUIModel(
        id = 11,
        pageNumbers = 864,
        edition = "Edição capa dura",
        language = "Português",
        translator = "Lúcia Fernandes",
        isbn = "MOCK-ISBN-0011",
        tittle = "A guerra dos Tronos: As Crônicas de Gelo e Fogo, volume 1",
        author = "George R. R. Martin",
        coverUrl = "https://covers.openlibrary.org/b/id/15139462-L.jpg",
    )

    val book12 = BookUIModel(
        id = 12,
        pageNumbers = 432,
        edition = "Edição histórica",
        language = "Português",
        translator = "Antônio R. Siqueira",
        isbn = "MOCK-ISBN-0012",
        tittle = "Eneida",
        author = "Vígilio",
        coverUrl = "https://ia601909.us.archive.org/view_archive.php?archive=/31/items/l_covers_0013/l_covers_0013_49.zip&file=0013499872-L.jpg",
    )

    val book13 = BookUIModel(
        id = 13,
        pageNumbers = 104,
        edition = "Edição revisada",
        language = "Português",
        translator = "Marina Cavalcanti",
        isbn = "MOCK-ISBN-0013",
        tittle = "A Metamorfose",
        author = "Fraz Kafka",
        coverUrl = "https://ia600507.us.archive.org/view_archive.php?archive=/8/items/l_covers_0009/l_covers_0009_22.zip&file=0009221228-L.jpg",
    )

    val book14 = BookUIModel(
        id = 14,
        pageNumbers = 176,
        edition = "Edição de aniversário",
        language = "Português",
        translator = "Não se aplica (original em português)",
        isbn = "MOCK-ISBN-0014",
        tittle = "Vidas Secas",
        author = "Graciliano Ramos",
        coverUrl = "https://ia800505.us.archive.org/view_archive.php?archive=/35/items/l_covers_0014/l_covers_0014_61.zip&file=0014618961-L.jpg",
    )

    val book15 = BookUIModel(
        id = 15,
        pageNumbers = 208,
        edition = "Edição limitada",
        language = "Português",
        translator = "Não se aplica (original em português)",
        isbn = "MOCK-ISBN-0015",
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