package com.encoders.countdowntimerinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var time: TextView
    private lateinit var start_timer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        time = findViewById(R.id.time)
        start_timer = findViewById(R.id.start_timer)

        start_timer.setOnClickListener {
            object : CountDownTimer(10000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    time.text = "Remaining Time is: " + millisUntilFinished / 1000 +" Sec"
                    start_timer.text = "Timer is Start"
                }
                override fun onFinish() {
                    time.text = "Time Fininished"
                    start_timer.text = "Start Timer"

                }
            }.start()
        }





    }
}