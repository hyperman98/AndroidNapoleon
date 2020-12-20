package com.example.napoleonitapp.features.main

import android.os.Bundle
import android.view.View
import com.example.napoleonitapp.data.Event
import com.example.napoleonitapp.R
import com.example.napoleonitapp.features.search.SearchFragment
import com.example.napoleonitapp.features.details.EventDetailsFragment
import com.example.napoleonitapp.features.elected.ElectedEventsFragment
import kotlinx.android.synthetic.main.fragment_show_events.*
import moxy.MvpAppCompatFragment

class MainFragment : MvpAppCompatFragment(R.layout.fragment_show_events) {

    val event = Event(
        "Человек-паук",
        "02.02.2020",
        "200",
        "https://gamemag.ru/images/cache/News/News149667/4d06059645-2_1390x600.jpg",
        "Человек паук вновь спасет мир."
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        btnShowDetailsEvent.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, EventDetailsFragment.newInstance(event))
                .addToBackStack("AllEventsFragment")
                .commit()
        }

        btnShowSelectedEvents.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, ElectedEventsFragment())
                .addToBackStack("AllEventsFragment")
                .commit()
        }

        btnExtentFindEvents.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, SearchFragment())
                .addToBackStack("AllEventsFragment")
                .commit()
        }
    }
}