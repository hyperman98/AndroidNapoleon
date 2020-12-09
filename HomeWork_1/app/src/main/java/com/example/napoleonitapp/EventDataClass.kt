package com.example.napoleonitapp

import android.os.Parcelable
import java.io.Serializable


data class EventDataClass(val film: String, val date: String, val price: String) : Serializable