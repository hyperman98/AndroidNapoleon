package com.example.napoleonitapp.features.search

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import com.example.napoleonitapp.R
import com.example.napoleonitapp.data.SettingsEvent
import kotlinx.android.synthetic.main.fragment_search.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class SearchFragment : MvpAppCompatFragment(R.layout.fragment_search), SearchView {

    @InjectPresenter
    lateinit var presenter: SearchPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {

        rgSearch.setOnCheckedChangeListener { group: RadioGroup?, checkedId: Int ->

            val selectedType = when (checkedId) {

                R.id.rbBeforeTwoWeeks -> RbTYPE.CLOSER
                R.id.rbAfterTwoWeeks -> RbTYPE.FURTHER
                else -> RbTYPE.ALL
            }

            presenter.setRbType(selectedType)
        }

        btnSearch.setOnClickListener {
            presenter.validate(
                etCountFrom.text.toString(),
                etCountTo.text.toString()
            )
        }
    }

    override fun showCountFromError() {

        showError("Количество от")
    }

    override fun showCountToError() {
        showError("Количество до")
    }

    override fun backToMainFragment(rbTYPE: RbTYPE) {
        // Сохранение объекта с данными
        val settingsEventDataClass = SettingsEvent(
            etCountFrom.text.toString(),
            etCountTo.text.toString(),
            rbTYPE
        )
    }

    private fun showError(text: String) {

        Toast.makeText(requireContext(), "Ошибка в поле '$text'", Toast.LENGTH_SHORT).show()
    }

}

