package com.example.oopdemo

import android.util.Log

class Driver(var name: String, credits: Int) {
//    var driverName = name
//    lateinit var driveName: String
    private var totalCredits = 50
    private val car = Car()
    init {
//        driveName = name
        totalCredits += credits
        car.maxSpeed = 100
        car.start()
    }
    fun showDetails(){
//        Log.i("MyTag", "Driver name is $driverName")
        Log.i("MyTag", "Total Credits are $totalCredits")
        Log.i("MyTag", "Driver name is $name")
    }
}