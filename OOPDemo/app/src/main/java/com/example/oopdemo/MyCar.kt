package com.example.oopdemo

import android.util.Log

class MyCar: Car(), SpeedController {
override fun start(){
    Log.i("MyTag","MyCar is starting... brand id is ${getBrandId()}")
    Log.i("MyTag", "MyCar max speed is $maxSpeed")
}

    override fun accel() {
        TODO("Not yet implemented")
    }

    override fun deaccel() {
        TODO("Not yet implemented")
    }
}