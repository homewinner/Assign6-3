package com.example.assign6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clear = Toast.makeText(applicationContext,"All fields are cleared.", Toast.LENGTH_LONG)
        val error = Toast.makeText(applicationContext,"All fields are cleared.", Toast.LENGTH_LONG)
        var sumall:Double
        var suminter:Double
        var y1:Double = 0.00
        var y2:Double = 0.00
        var y3:Double = 0.00
        var i1:Double
        var i2:Double
        var i3:Double

        bcal.setOnClickListener(){
            val a = input.getText().toString().toDouble()
            for (z in 1..10){
                if (z >= 1 && z <= 3){
                    i1 = a * 3 / 100
                    y1 = y1 + i1
                    i1 = 0.00
                    year1.setText("$y1")
                }else if (z >= 4 && z <= 7){
                    i2 = a * 5 / 100
                    y2 = y2 + i2
                    i2 = 0.00
                    year2.setText("$y2")
                }else if (z >= 8 && z <= 10){
                    i3 = a * 7 / 100
                    y3 = y3 + i3
                    i3 = 0.00
                    year3.setText("$y3")
                }
            }
            suminter = y1 + y2 + y3
            sumall = a + suminter
            inter.setText("$suminter")
            sum.setText("$sumall")
        }
        bclear.setOnClickListener(){
            input.setText(null)
            year1.setText(null)
            year2.setText(null)
            year3.setText(null)
            inter.setText(null)
            sum.setText(null)
            clear.show()
        }
    }
}