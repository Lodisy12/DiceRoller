package com.example.diceroller

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll6Button: Button = findViewById(R.id.roll_1d6_button)
        roll6Button.text = "Let's Roll"
        roll6Button.setOnClickListener { Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show() }
    }
}
