package com.hylsonk.biblioteca.UI.Activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.hylsonk.biblioteca.Repository.RepositoryBooks
import com.hylsonk.biblioteca.R
import com.hylsonk.biblioteca.Contract.BooksContract
import com.hylsonk.biblioteca.Presenter.BooksPresenter

class MainActivity : AppCompatActivity(), BooksContract.View {
    override fun getContext(): Context {
        return this
    }

    private lateinit var presenter: BooksPresenter

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var list: ListView
    private lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = BooksPresenter(
            this,
            RepositoryBooks()
        )

        presenter.getBooks()
        presenter.changeFragment()
    }

    override fun setFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)

        transaction.commit()
    }

}
