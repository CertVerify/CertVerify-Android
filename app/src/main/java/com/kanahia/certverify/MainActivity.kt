package com.kanahia.certverify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer = object : CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // This method will be called every second until the timer is finished
                // You can update UI or perform any action here if needed
            }

            override fun onFinish() {
                // This method will be called when the timer is finished (after 2 seconds in this case)
                // You can navigate to the main activity or perform any other action here
                startMainActivity()
            }
        }

        // Start the timer when the splash screen activity is created
        timer.start()
    }

    private fun startMainActivity() {
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
        finish() // Optional: finish the splash screen activity so that it's not in the back stack
    }
}