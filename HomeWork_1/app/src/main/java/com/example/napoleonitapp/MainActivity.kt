package com.example.napoleonitapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    companion object{
        val testTag = "TestTag"
        val eventKey = "Event"
        val requestEventCode = 1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(testTag, "MainActivity - onCreate()")
        btnToNextActivity.setOnClickListener {
            toNextActivity()
        }

    }

    override fun onStart() {
        Log.d(testTag, "MainActivity - onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d(testTag, "MainActivity - onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d(testTag, "MainActivity - onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d(testTag, "MainActivity - onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(testTag, "MainActivity - onDestroy()")
        super.onDestroy()
    }

    private fun toNextActivity() {

        val intent = Intent(this, EventDetailsActivity::class.java)
        val event =
            EventDataClass(etName.text.toString(), etDate.text.toString(), etCount.text.toString())
        intent.putExtra(eventKey, event)
        startActivityForResult(intent, requestEventCode)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode == requestEventCode) {

            if (resultCode == Activity.RESULT_OK) {
                val event = data?.getSerializableExtra(eventKey) as EventDataClass

                etName.setText(event.name)
                etDate.setText(event.date)
                etCount.setText(event.participantCount)
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}