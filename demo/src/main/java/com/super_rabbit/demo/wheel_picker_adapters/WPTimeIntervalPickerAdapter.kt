package com.super_rabbit.demo.wheel_picker_adapters

import com.super_rabbit.wheel_picker.WheelAdapter
import java.sql.Time
import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by wanglu on 3/28/18.
 */
class WPTimeIntervalPickerAdapter : WheelAdapter() {
    override fun getValue(position: Int): String {
        val startTime = Time(0, 0, 0)
        val cal = Calendar.getInstance()
        cal.time = startTime
        cal.add(Calendar.MINUTE, 30 * position)
        val sdf = SimpleDateFormat("HH:mm")
        return sdf.format(cal.time)


       /* return when (position) {
            0 -> "1"
            1 -> "2"
            2 -> "3"
            3 -> "4"
            4 -> "5"
            5 -> "6"
            6 -> "7"
            7 -> "8"
            8 -> "9"
            9 -> "10"
            10 -> "11"
            11 -> "12"
            else -> ""
        }*/
    }

    override fun getPosition(vale: String): Int {
        return vale.toInt()
    }

    override fun getTextWithMaximumLength(): String {
        return "47"
    }
}