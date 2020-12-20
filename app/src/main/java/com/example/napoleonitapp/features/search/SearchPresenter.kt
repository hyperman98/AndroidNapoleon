package com.example.napoleonitapp.features.search

import moxy.InjectViewState
import moxy.MvpPresenter
import java.lang.Exception


@InjectViewState
class SearchPresenter(): MvpPresenter<SearchView>() {


    var curRbTYPE: RbTYPE = RbTYPE.ALL

    fun setRbType(selectedType: RbTYPE){

        curRbTYPE = selectedType

    }

    fun validate(countFrom: String, countTo: String) {

        when{
            !countIsCorrect(countFrom) -> viewState.showCountFromError()
            !countIsCorrect(countTo) -> viewState.showCountToError()
            else -> viewState.backToMainFragment(curRbTYPE)
        }
    }

    private fun countIsCorrect(countText: String):Boolean{

        if (countText.isEmpty()) return false

        return try {

            val count = countText.toInt()
            count in 0..1000000
        } catch (e: Exception){
            false
        }
    }


}