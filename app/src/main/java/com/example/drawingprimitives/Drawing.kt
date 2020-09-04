package com.example.drawingprimitives

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Drawing(context: Context?) : View(context) {

    lateinit var brush : Paint

    lateinit var drawLineBrush : Paint

    lateinit var pen : Paint

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {


        //To show TextView using Paint

        pen = Paint(Paint.ANTI_ALIAS_FLAG)
        pen.color = Color.parseColor("blue")
        pen.textSize = 66f
        pen.textAlign = Paint.Align.CENTER

        canvas!!.drawText("Hello World!!!",(measuredWidth/2).toFloat(),(measuredHeight/2).toFloat(),pen)


        //To Show Bitmap Image using Paint
//        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.ironman)
//        //-(bitmap.height/2) & -(bitmap.width/2) is added to make the position of image in center
//        canvas!!.drawBitmap(bitmap,(measuredWidth/2).toFloat()-(bitmap.width/2),(measuredHeight/2).toFloat()-(bitmap.height/2),null)


        //To show circle or rectangle using Paint
//        brush = Paint(Paint.ANTI_ALIAS_FLAG)
//        drawLineBrush = Paint(Paint.ANTI_ALIAS_FLAG)
//        drawLineBrush.strokeWidth = 20F
//        brush.color = Color.parseColor("green")
//        drawLineBrush.color = Color.parseColor("blue")
//        canvas!!.drawCircle((measuredWidth/2).toFloat(), (measuredHeight/2).toFloat(),124f,brush)
//        canvas.drawLine(0F, (measuredHeight/2).toFloat(), (measuredWidth/2).toFloat(), (measuredHeight/2).toFloat(),drawLineBrush)
//

        canvas.save()
        super.onDraw(canvas)
    }
}