package com.example.napoleonitapp.data

import android.os.Parcelable
import com.example.napoleonitapp.features.search.RbTYPE
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SettingsEvent(val countFromText: String, val countToText: String, val rbTYPE: RbTYPE): Parcelable
