package com.example.dependencinjection.dependencies

import android.util.Log

class HardDisk {
    init {
        Log.e("TAGY", "Storage started on the hard disk")
    }

    fun startStorage(){
        Log.e("StorageSpace", "Your remaining with 270GB storage")
    }
}