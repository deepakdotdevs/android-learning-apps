package com.example.intent

import android.R.attr.data
import android.R.attr.text
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.userInput)
        val transfrButton = findViewById<Button>(R.id.saveexplicit)
        transfrButton.setOnClickListener {
            val userInput = editText.text.toString()
            startActivity(Intent(this, NextScreen::class.java).putExtra("i", userInput))

        // 2nd Method to startActivity :
//            val text = data.text.toString()
//            val Intent = Intent(this, NextScreen::class.java)
//            Intent.putExtra("data", text)
//            startActivity(Intent)

        }
    }
}