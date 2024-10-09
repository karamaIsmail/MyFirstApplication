package com.example.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val toastButton = findViewById<Button>(R.id.button_toast)
        val countButton = findViewById<Button>(R.id.button_count)
        val countTextView = findViewById<TextView>(R.id.textview)


        toastButton.setOnClickListener {
            // Display a short Toast message
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
        }
        countButton.setOnClickListener {
            // Increase the count and update the TextView
            count++
            countTextView.text = count.toString()
        }





        }
    }
