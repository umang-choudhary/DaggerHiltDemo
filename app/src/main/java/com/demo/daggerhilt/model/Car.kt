package com.demo.daggerhilt.model

import android.util.Log
import com.demo.daggerhilt.TAG
import javax.inject.Inject

class Car @Inject constructor() {

    @Inject
    lateinit var engine: DieselEngine

    @Inject
    lateinit var wheel: Wheel

    fun drive() {
        wheel.inflate()
        engine.start()
        Log.d(TAG, "$this running with $engine & $wheel")
    }

}