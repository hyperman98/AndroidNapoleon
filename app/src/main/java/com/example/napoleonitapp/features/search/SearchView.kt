package com.example.napoleonitapp.features.search

import moxy.MvpView
import moxy.viewstate.strategy.alias.Skip

interface SearchView: MvpView {


    @Skip
    fun showCountFromError()

    @Skip
    fun showCountToError()

    @Skip
    fun backToMainFragment(rbTYPE: RbTYPE)
}