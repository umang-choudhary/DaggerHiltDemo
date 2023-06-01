package com.demo.daggerhilt.model

import android.util.Log
import com.demo.daggerhilt.TAG
import javax.inject.Inject

class DieselEngine @Inject constructor(
    private val horsePower: Int
) {

    fun start() {
        Log.d(TAG, "$this started with Horse Power: $horsePower")
    }

}