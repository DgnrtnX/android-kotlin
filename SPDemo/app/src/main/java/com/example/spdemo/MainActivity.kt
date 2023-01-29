package com.example.spdemo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var sf: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.etName)
        ageEditText = findViewById(R.id.etAge)
        sf = getSharedPreferences("My_sf", MODE_PRIVATE)
        editor = sf.edit()
    }

    override fun onPause() {
        super.onPause()
        editor.apply {
            putString("sf_name", nameEditText.text.toString())
            putInt("sf_age", ageEditText.text.toString().toInt())
            commit()
        }
    }

    override fun onResume() {
        super.onResume()
        val name = sf.getString("sf_name",null)
        val age = sf.getInt("sf_age",0)
        nameEditText.setText(name)
        if (age !=0)
        ageEditText.setText(age.toString())

    }
}