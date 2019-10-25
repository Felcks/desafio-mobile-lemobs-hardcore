package com.hylsonk.biblioteca.Contract

import android.content.Context
import androidx.fragment.app.Fragment

interface BooksContract {
    interface View{
        fun getContext(): Context
        fun setFragment(fragment: Fragment)
    }

    interface Presenter {
        fun getBooks(): Array<String>
        fun changeFragment()
    }
}