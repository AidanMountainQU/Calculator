package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var input1: EditText? = null
    var input2: EditText? = null
    var result: TextView? = null
    @SuppressLint("MissingInflatedId")
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById<EditText>(R.id.input1)
        input2 = findViewById<EditText>(R.id.input2)
        result = findViewById<EditText>(R.id.result_label)
    }
    private fun performOp(op: Char){
        val num1: Double = input1?.getText().toString().toDouble()
        val num2: Double = input1?.getText().toString().toDouble()

        Log.v("Debug","num1"+num1+"num2"+num2)

        var res = 0.0
        when (op){
            '+' -> result = num1 + num2
            '-' -> result = num1 - num2
            '*' -> result = num1 * num2
            '/' -> result = num1 / num2
        }
        result?.setText(java.lang.Double.toString(res));
    }
}