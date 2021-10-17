package com.example.aibsimplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var firstBTN:Button
    lateinit var secoundBTN:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstBTN=findViewById(R.id.buttonone)
        secoundBTN=findViewById(R.id.buttontwo)

        firstBTN.setOnClickListener {
            Toast.makeText(this, "Hi I am implemented using Kotlin code", Toast.LENGTH_LONG).show()

        }


    }

    fun clickme(view: android.view.View) {
        Toast.makeText(this, "Hi I am implemented using  XML", Toast.LENGTH_LONG).show()
    }
}