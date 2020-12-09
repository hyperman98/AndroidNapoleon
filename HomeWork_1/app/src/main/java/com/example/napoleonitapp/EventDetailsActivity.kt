package com.example.napoleonitapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.napoleonitapp.MainActivity.Companion.eventKey
import com.example.napoleonitapp.MainActivity.Companion.testTag
import kotlinx.android.synthetic.main.activity_event_details.*

class EventDetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_details)
        Log.d(testTag, "EventDetailsActivity - onCreate()")
        val event = intent.extras?.getSerializable(eventKey) as EventDataClass
        etName.setText(event.film)
        etDate.setText(event.date)
        etCount.setText(event.price)

        btnBackTo.setOnClickListener {
            backTo()
        }
    }

    override fun onStart() {
        Log.d(testTag, "EventDetailsActivity - onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d(testTag, "EventDetailsActivity - onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d(testTag, "EventDetailsActivity - onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d(testTag, "EventDetailsActivity - onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(testTag, "EventDetailsActivity - onDestroy()")
        super.onDestroy()
    }


    override fun onBackPressed() {
        backTo()
    }

    private fun backTo() {

        val intent = Intent()
        val event = EventDataClass(etName.text.toString(), etDate.text.toString(), etCount.text.toString())
        intent.putExtra(eventKey, event)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}