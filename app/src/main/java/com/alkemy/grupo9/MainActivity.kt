package com.alkemy.grupo9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_navigate)
        button.setOnClickListener {
            val intent = Intent(this, MessageActivity::class.java)
            intent.putExtra("message", getString(R.string.app_name))
            startActivity(intent)
        }
    }
}