package com.example.drawingprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Drawing(context: Context?) : View(context) {

    lateinit var brush : Paint

    override fun onDraw(canvas: Canvas?) {
        brush = Paint(Paint.ANTI_ALIAS_FLAG)
        brush.color = Color.parseColor("green")
        canvas!!.drawCircle((measuredWidth/2).toFloat(), (measuredHeight/2).toFloat(),124f,brush)
        canvas.save()
        super.onDraw(canvas)
    }
}