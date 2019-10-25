package com.hylsonk.biblioteca.Presenter

import android.content.Context
import androidx.fragment.app.Fragment
import com.hylsonk.biblioteca.Repository.RepositoryBooks
import com.hylsonk.biblioteca.Contract.BooksContract
import com.hylsonk.biblioteca.Contract.FragmentContract
import com.hylsonk.biblioteca.UI.Fragments.FragmentBookStore
import com.hylsonk.biblioteca.UI.Fragments.FragmentMyBooks
import com.hylsonk.biblioteca.UI.Fragments.FragmentTransactions

class BooksPresenter (private val view: BooksContract.View,
                      private val repositoryBooks: RepositoryBooks
) : BooksContract.Presenter, FragmentContract.Presenter {

    val INITIAL = "MYBOOKS"
    val STORE = "STORE"
    val TRANSACTIONS = "TRANSACTIONS"

    lateinit var fragment: Fragment

    var actualFragment = TRANSACTIONS

    override fun getBooks(): Array<String> {
        return repositoryBooks.getBooks()
    }
    override fun getContext(): Context {
        return view.getContext()
    }

    override fun changeFragment() {
        when(actualFragment) {
            STORE->fragment = FragmentBookStore()
            TRANSACTIONS->fragment = FragmentTransactions()
            else ->fragment = FragmentMyBooks()
        }
        view.setFragment(fragment)
    }

    fun changeActualFragment(string: String){
        actualFragment = string
    }
}