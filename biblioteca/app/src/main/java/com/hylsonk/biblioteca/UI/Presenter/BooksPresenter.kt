package com.hylsonk.biblioteca.UI.Presenter

import com.hylsonk.biblioteca.Repository.RepositoryBooks
import com.hylsonk.biblioteca.UI.Contract.BooksContract

class BooksPresenter (private val view: BooksContract.View,
                      private val repositoryBooks: RepositoryBooks
) : BooksContract.Presenter {

    override fun getBooks() {

        val books = repositoryBooks.getBooks()

        view.mostraDados(books);
    }
}