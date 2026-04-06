package com.example.unimarket.activities.auth

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R
import com.example.unimarket.utils.Validator

class RegisterActivity : AppCompatActivity() {

    private lateinit var etFullName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var actvRole: AutoCompleteTextView
    private lateinit var btnRegister: Button
    private lateinit var tvLogin: TextView

    private val roles = listOf("Buyer", "Seller")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etFullName = findViewById(R.id.etFullName)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        actvRole = findViewById(R.id.actvRole)
        btnRegister = findViewById(R.id.btnRegister)
        tvLogin = findViewById(R.id.tvLogin)

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, roles)
        actvRole.setAdapter(adapter)

        btnRegister.setOnClickListener {
            val fullName = etFullName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val confirmPassword = etConfirmPassword.text.toString().trim()
            val role = actvRole.text.toString().trim()

            when {
                fullName.isEmpty() -> etFullName.error = "Enter full name"
                !Validator.isValidEmail(email) -> etEmail.error = "Enter a valid email"
                !Validator.isValidPassword(password) -> etPassword.error =
                    "Password must be at least 6 characters"
                password != confirmPassword -> etConfirmPassword.error = "Passwords do not match"
                role.isEmpty() -> actvRole.error = "Select a role"
                else -> {
                    Toast.makeText(
                        this,
                        "Registration successful as $role",
                        Toast.LENGTH_SHORT
                    ).show()

                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
            }
        }

        tvLogin.setOnClickListener {
            finish()
        }
    }
}