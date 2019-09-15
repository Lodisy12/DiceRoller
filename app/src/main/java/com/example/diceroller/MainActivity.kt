package com.example.diceroller

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll6Button: Button = findViewById(R.id.roll_1d6_button)
        roll6Button.text = "Let's Roll"
        roll6Button.setOnClickListener {
            rollDice()

        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.d6Result_text)
        resultText.text = "Dice Rolled!"
    }
}