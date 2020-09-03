package com.example.drawingprimitives

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val drawing = Drawing(this)

        drawing.setOnClickListener {

        }

        setContentView(drawing)
        //setContentView(R.layout.activity_main)
    }
}