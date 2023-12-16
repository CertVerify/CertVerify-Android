package com.kanahia.certverify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivitySignUp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var btn = findViewById<Button>(R.id.signUpButton)

        btn.setOnClickListener {
            startActivity(Intent(this,Home::class.java))
        }
    }
}