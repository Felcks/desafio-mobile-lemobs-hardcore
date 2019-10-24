package com.hylsonk.biblioteca.UI.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.hylsonk.biblioteca.Repository.RepositoryBooks
import com.hylsonk.biblioteca.R
import com.hylsonk.biblioteca.UI.Contract.BooksContract
import com.hylsonk.biblioteca.UI.Fragments.FragmentBookStore
import com.hylsonk.biblioteca.UI.Presenter.BooksPresenter

class MainActivity : AppCompatActivity(), BooksContract.View {

    private lateinit var presenter: BooksPresenter

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var list:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = BooksPresenter(
            this,
            RepositoryBooks()
        )

        val fragment = FragmentBookStore()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)

        transaction.commit()

    }

    override fun mostraDados(books: Array<String>) {

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            android.R.id.text1, books)

        list.adapter = adapter
    }
}
