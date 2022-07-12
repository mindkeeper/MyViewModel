package com.example.myviewmodel

import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class Base: AppCompatActivity() {
    fun View.displayResult(result: String) {
        val tvResult = this.findViewById<TextView>(R.id.tvResult)
        tvResult.text = result
    }
}