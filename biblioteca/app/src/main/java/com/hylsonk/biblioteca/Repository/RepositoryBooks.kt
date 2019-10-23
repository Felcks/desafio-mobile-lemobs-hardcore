package com.hylsonk.biblioteca.Repository

import com.hylsonk.biblioteca.Model.Book

class RepositoryBooks {
    private val books: List<Book>

    fun getBooks(): Array<String>{
        return books
    }
}