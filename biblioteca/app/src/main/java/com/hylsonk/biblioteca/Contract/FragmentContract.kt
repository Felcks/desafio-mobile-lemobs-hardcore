package com.hylsonk.biblioteca.Contract

import android.content.Context

interface FragmentContract {
    interface Fragment{

    }

    interface Presenter {
        fun getContext(): Context
    }
}