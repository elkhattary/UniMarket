package com.example.unimarket.activities.common

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class ProfileActivity : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvRole: TextView
    private lateinit var btnSettings: Button
    private lateinit var btnBackProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        tvName = findViewById(R.id.tvName)
        tvEmail = findViewById(R.id.tvEmail)
        tvRole = findViewById(R.id.tvRole)
        btnSettings = findViewById(R.id.btnSettings)
        btnBackProfile = findViewById(R.id.btnBackProfile)

        // Temporary data (replace later with Firebase)
        tvName.text = "John Doe"
        tvEmail.text = "user@gmail.com"
        tvRole.text = "Buyer"

        btnSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        btnBackProfile.setOnClickListener {
            finish()
        }
    }
}