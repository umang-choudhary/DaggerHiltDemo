package com.demo.daggerhilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demo.daggerhilt.model.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.drive()
    }
}