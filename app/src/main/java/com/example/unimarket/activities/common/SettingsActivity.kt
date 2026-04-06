package com.example.unimarket.activities.common

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class SettingsActivity : AppCompatActivity() {

    private lateinit var btnChangePassword: Button
    private lateinit var btnNotifications: Button
    private lateinit var btnBackSettings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        btnChangePassword = findViewById(R.id.btnChangePassword)
        btnNotifications = findViewById(R.id.btnNotifications)
        btnBackSettings = findViewById(R.id.btnBackSettings)

        btnChangePassword.setOnClickListener {
            Toast.makeText(this, "Change Password clicked", Toast.LENGTH_SHORT).show()
        }

        btnNotifications.setOnClickListener {
            Toast.makeText(this, "Notification settings clicked", Toast.LENGTH_SHORT).show()
        }

        btnBackSettings.setOnClickListener {
            finish()
        }
    }
}