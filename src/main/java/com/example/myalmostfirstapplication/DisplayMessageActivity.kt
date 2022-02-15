package com.example.myalmostfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.TextView
import android.os.Bundle as Bundle1


class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        findViewById<TextView>(R.id.textView).apply {
            text = message
        }

    }
}