package com.example.napoleonitapp.features.elected

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.napoleonitapp.R
import moxy.MvpAppCompatFragment


class ElectedEventsFragment : MvpAppCompatFragment(R.layout.fragment_selected_events), ElectedEventsView {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}