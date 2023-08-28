package com.example.dependencinjection.dependencies

import android.util.Log

class Battery {
    init {
        Log.e("TAGY", "Batter in user now")
    }

    fun displayBatteryStatus(){
        Log.e("TAGY", "90% remaining of battery")
    }
}