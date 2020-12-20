package com.example.napoleonitapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Event(val name: String, val date: String, val price: String,
                 val eventImageView: String, val description: String) : Parcelable