package com.demo.daggerhilt.model

import android.util.Log
import com.demo.daggerhilt.TAG

class Wheel(private val rim: Rim, private val tyre: Tyre) {

    fun inflate() {
        Log.d(TAG, "$this inflated with $rim & $tyre")
    }

}