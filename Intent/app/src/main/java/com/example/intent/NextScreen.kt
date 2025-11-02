package com.example.intent

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NextScreen : AppCompatActivity() {
    private lateinit var counterTextView : TextView
    private var counter =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_next_screen)
        val RecivedData = intent.getStringExtra("i")
        val textview = findViewById<TextView>(R.id.textView)
        textview.text = RecivedData

        counterTextView = findViewById<TextView>(R.id.textView2)
        savedInstanceState?.let {
            counter  = it.getInt("counter", 0)
            counterTextView.text = counter.toString()
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            counter++
            counterTextView.text= counter.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter)
    }
}