package com.example.dependencinjection.dependencies

import android.util.Log

class Laptop(val hardDisk: HardDisk, val battery: Battery) {

    init {
        hardDisk.startStorage()
        battery.displayBatteryStatus()
    }

    fun startLaptop(){
        Log.e("Tagy", "Laptop started")
    }
}