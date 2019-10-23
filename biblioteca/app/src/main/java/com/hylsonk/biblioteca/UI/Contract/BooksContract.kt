package com.hylsonk.biblioteca.UI.Contract

interface BooksContract {
    interface View{
        fun mostraDados(books: Array<String>)
    }

    interface Presenter {
        fun getBooks()
    }
}