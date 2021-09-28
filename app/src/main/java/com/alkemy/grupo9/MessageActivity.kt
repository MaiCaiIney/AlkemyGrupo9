package com.alkemy.grupo9

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MessageActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val textView = findViewById<TextView>(R.id.text_view_message)
        val message = intent?.extras?.getString("message")

        textView.text = message
    }
}