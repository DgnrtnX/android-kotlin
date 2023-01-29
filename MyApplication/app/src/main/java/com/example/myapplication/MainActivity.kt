package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val textView = findViewById<TextView>(R.id.tvhello)
            val inputText = findViewById<EditText>(R.id.etName)
            val submitBtn = findViewById<Button>(R.id.btSubmit)
            val offersBtn = findViewById<Button>(R.id.btOffers)
            var newName = ""
            submitBtn.setOnClickListener {
                if (inputText.text.toString() != "") {
                    newName = inputText.text.toString()
                    textView.text = "Hello $newName"
                    inputText.text.clear()
                    offersBtn.visibility = VISIBLE
                }else{
                    offersBtn.visibility = INVISIBLE
                    textView.text = ""
                    Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                        .show()

                }
            }
        offersBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", newName)
            startActivity(intent)
        }
    }
}