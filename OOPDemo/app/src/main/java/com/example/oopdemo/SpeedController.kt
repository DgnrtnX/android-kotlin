package com.example.oopdemo

interface SpeedController {
    fun accel()
    fun deaccel()
    fun getBrandId(): String{
        return "AGI0882"
    }
}