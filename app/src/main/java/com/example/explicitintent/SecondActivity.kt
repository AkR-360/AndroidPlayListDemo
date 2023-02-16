package com.example.explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead  = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.LinearLayout)

        buttonRead.setOnClickListener {
            // change the theme to light mode such As yellow
            layout.setBackgroundResource(R.color.AliceBlue)
        }
        buttonDark.setOnClickListener {
            //change the theme to dark mode black
            layout.setBackgroundResource(R.color.black)
        }
    }
}