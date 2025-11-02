package com.example.intent

import android.R.attr.data
import android.R.attr.text
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.userInput) // part of explicit
        val transfrButton = findViewById<Button>(R.id.saveexplicit) // part of explicit
        val shareButton = findViewById<Button>(R.id.shareimplicit) // part of implicit

        // Explicit Intent

        transfrButton.setOnClickListener {
            val userInput = editText.text.toString()
            startActivity(Intent(this, NextScreen::class.java).putExtra("i", userInput))

        // 2nd Method to startActivity :
//            val text = data.text.toString()
//            val Intent = Intent(this, NextScreen::class.java)
//            Intent.putExtra("data", text)
//            startActivity(Intent)

            // Implicit Intent

        shareButton.setOnClickListener {
            val userInput = editText.text.toString()
            if(userInput.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, userInput)
                }
                startActivity(intent)
            }else {
                Toast.makeText(this, "Please write a Text Note, First", Toast.LENGTH_SHORT).show()
            }
            }
        }
    }
}