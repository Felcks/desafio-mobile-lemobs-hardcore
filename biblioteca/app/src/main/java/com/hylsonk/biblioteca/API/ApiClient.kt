package com.hylsonk.biblioteca.API

import android.net.Uri
import android.util.Log
import com.google.gson.GsonBuilder
import com.hylsonk.biblioteca.Model.Book
import com.hylsonk.biblioteca.Model.BooksResult
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Observable


class ApiClient {
    val service : ApiInterface

    init {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)

        val gson = GsonBuilder().setLenient().create()

        val retrofit = Retrofit.Builder()
            .baseUrl("http://localhost:3000/")
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(httpClient.build())
            .build()
        service = retrofit.create<ApiInterface>(ApiInterface::class.java)
    }

    fun loadBooks() : Observable<Book>{
        return service.listBooks()
            .flatMap {books -> Observable.from(books.results) }
            .flatMap {book -> Observable.just(Book(book.title, book.price, book.writer, book.thumbnailHd, book.date))}
    }
}
