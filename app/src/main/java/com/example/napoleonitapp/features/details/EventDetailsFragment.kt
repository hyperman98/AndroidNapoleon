package com.example.napoleonitapp.features.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.napoleonitapp.data.Event
import com.example.napoleonitapp.R
import kotlinx.android.synthetic.main.fragment_event_details.*
import moxy.MvpAppCompatFragment


class EventDetailsFragment : MvpAppCompatFragment(R.layout.fragment_event_details), DetailsView {

    companion object {
        private var EVENT = "EVENT"

        @JvmStatic
        fun newInstance(event: Event) =
            EventDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(EVENT, event)
                }
            }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        arguments?.let {
            val event = it.getParcelable<Event>(EVENT)

            Glide.with(this)
                .load(event?.eventImageView)
                .apply(RequestOptions.circleCropTransform())
                .into(EventImageView)

            tvName.text = event?.name
            tvDate.text = event?.date
            tvPartCount.text = event?.participantCount
            tvDescription.text = event?.description
        }

    }
}