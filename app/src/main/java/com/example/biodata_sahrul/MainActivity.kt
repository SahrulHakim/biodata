package com.example.biodata_sahrul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfile: CardView = findViewById(R.id.Profile)
        val btnschool: CardView = findViewById(R.id.School)
        val btnhoby: CardView = findViewById(R.id.hoby)
        val btneducation: CardView = findViewById(R.id.education)
        val btnskils: CardView = findViewById(R.id.skils)


        btnProfile.setOnClickListener {
           val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        btnschool.setOnClickListener {
            val intent = Intent(this, School::class.java)
            startActivity(intent)
        }
        btnhoby.setOnClickListener {
            val intent = Intent(this, Hoby::class.java)
            startActivity(intent)
        }
        btneducation.setOnClickListener {
            val intent = Intent(this, Education::class.java)
            startActivity(intent)
        }
        btnskils.setOnClickListener {
            val intent = Intent(this, Skils::class.java)
            startActivity(intent)
        }
    }
}