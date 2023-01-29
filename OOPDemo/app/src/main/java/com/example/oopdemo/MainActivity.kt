package com.example.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val audi = Car()
//        audi.start()
        val myCar = MyCar()
        myCar.maxSpeed = 1000
        myCar.start()
        val driver = Driver("Shyam", 1000)
        driver.showDetails()

    }
}