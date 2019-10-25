package com.hylsonk.biblioteca.API

import com.hylsonk.biblioteca.Model.BooksResult
import retrofit2.http.GET
import rx.Observable

interface ApiInterface {
    @GET("books")
    fun listBooks(): Observable<BooksResult>
}