package com.hylsonk.biblioteca.UI.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.hylsonk.biblioteca.Repository.RepositoryBooks
import com.hylsonk.biblioteca.R
import com.hylsonk.biblioteca.UI.Contract.BooksContract
import com.hylsonk.biblioteca.UI.Presenter.BooksPresenter

class MainActivity : AppCompatActivity(), BooksContract.View {

    private lateinit var presenter: BooksPresenter

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var list:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        presenter = BooksPresenter(
            this,
            RepositoryBooks()
        )

        list = findViewById<ListView>(R.id.list_books)

        presenter.getBooks()
    }

    override fun mostraDados(books: Array<String>) {

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            android.R.id.text1, books)

        list.adapter = adapter
    }
}
