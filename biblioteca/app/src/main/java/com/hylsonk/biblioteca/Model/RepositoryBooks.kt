package com.hylsonk.biblioteca.Model

class RepositoryBooks {
    private val books = arrayOf(
        "Prisioneiros da Mente",
        "O Poder do Hábito",
        "Harry Potter e as Relíquias da Morte",
        "A Guerra dos Tronos"
    )

    fun getBooks(): Array<String>{
        return books
    }
}