package com.kanahia.certverify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var profileCrd = findViewById<CardView>(R.id.profileCardView)
        profileCrd.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
    }
}