package com.example.dependencinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencinjection.dependencies.Battery
import com.example.dependencinjection.dependencies.HardDisk
import com.example.dependencinjection.dependencies.Laptop

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val battery = Battery()
        val hardDisk = HardDisk()
        val laptop = Laptop(hardDisk, battery)

        laptop.startLaptop()
    }
}