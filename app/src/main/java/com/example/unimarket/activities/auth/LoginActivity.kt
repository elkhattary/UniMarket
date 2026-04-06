package com.example.unimarket.activities.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R
import com.example.unimarket.activities.admin.AdminDashboardActivity
import com.example.unimarket.activities.buyer.HomeActivity
import com.example.unimarket.activities.seller.SellerDashboardActivity
import com.example.unimarket.utils.Validator

class LoginActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvRegister: TextView
    private lateinit var tvForgotPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvRegister = findViewById(R.id.tvRegister)
        tvForgotPassword = findViewById(R.id.tvForgotPassword)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (!Validator.isValidEmail(email)) {
                etEmail.error = "Enter a valid email"
                return@setOnClickListener
            }

            if (!Validator.isValidPassword(password)) {
                etPassword.error = "Password must be at least 6 characters"
                return@setOnClickListener
            }

            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

            when {
                email.equals("admin@trustcart.com", ignoreCase = true) -> {
                    startActivity(Intent(this, AdminDashboardActivity::class.java))
                }
                email.equals("seller@trustcart.com", ignoreCase = true) -> {
                    startActivity(Intent(this, SellerDashboardActivity::class.java))
                }
                else -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                }
            }

            finish()
        }

        tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        tvForgotPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }
    }
}