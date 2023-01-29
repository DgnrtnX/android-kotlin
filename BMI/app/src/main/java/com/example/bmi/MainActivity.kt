package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weightEditTextView = findViewById<TextView>(R.id.etWeight)
        val heightEditTextView = findViewById<TextView>(R.id.etHeight)
        val calcBtn = findViewById<Button>(R.id.btCalculate)

        calcBtn.setOnClickListener {
            val weight = weightEditTextView.toString()
            val height = heightEditTextView.toString()
            var bmi = String.format(
                "%.3f",
                weight.toFloat() / ((height.toFloat() / 100) * (height.toFloat() / 100))
            ).toFloat()
            displayBMI(bmi)
        }
    }

    private fun displayBMI(bmi: Float) {
        var resultIndex = findViewById<TextView>(R.id.tvIndex)
        var resultDesc = findViewById<TextView>(R.id.tvResult)
        var resultInfo = findViewById<TextView>(R.id.tvInfo)

        resultIndex.text = bmi.toString()
        resultInfo.text = "Normal Range is 18.5 - 24.9"
    }
}