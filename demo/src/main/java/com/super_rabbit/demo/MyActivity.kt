package com.super_rabbit.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import com.super_rabbit.wheel_picker.LockableNestedScrollView
import com.super_rabbit.wheel_picker.OnScrollListener
import com.super_rabbit.wheel_picker.WheelPicker


class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        val scrollView = findViewById<LockableNestedScrollView>(R.id.scrollView)
        val numberPicker = findViewById<WheelPicker>(R.id.numberPicker)
        val numberPicker2 = findViewById<WheelPicker>(R.id.numberPicker2)
        numberPicker.setOnScrollListener(
           scrollView
        )
        numberPicker2.setOnScrollListener(
           scrollView
        )
    }
}
