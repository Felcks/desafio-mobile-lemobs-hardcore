package com.hylsonk.biblioteca.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BooksResult(val results : List<Book>)

data class Book (
    @Expose
    @SerializedName("title")
    val title: String,
    @Expose
    @SerializedName("price")
    val price: Int,
    @Expose
    @SerializedName("writer")
    val writer: String,
    @Expose
    @SerializedName("thumbnailHd")
    val thumbnailHd: String,
    @Expose
    @SerializedName("date")
    val date: String
)