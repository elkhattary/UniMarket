package com.example.unimarket.activities.seller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class SellerVerificationActivity : AppCompatActivity() {

    private lateinit var etBusinessName: EditText
    private lateinit var etBusinessEmail: EditText
    private lateinit var etBusinessDocument: EditText
    private lateinit var btnSubmitVerification: Button
    private lateinit var btnBackVerification: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller_verification)

        etBusinessName = findViewById(R.id.etBusinessName)
        etBusinessEmail = findViewById(R.id.etBusinessEmail)
        etBusinessDocument = findViewById(R.id.etBusinessDocument)
        btnSubmitVerification = findViewById(R.id.btnSubmitVerification)
        btnBackVerification = findViewById(R.id.btnBackVerification)

        btnSubmitVerification.setOnClickListener {
            val businessName = etBusinessName.text.toString().trim()
            val businessEmail = etBusinessEmail.text.toString().trim()
            val businessDocument = etBusinessDocument.text.toString().trim()

            when {
                businessName.isEmpty() -> etBusinessName.error = "Enter business name"
                businessEmail.isEmpty() -> etBusinessEmail.error = "Enter business email"
                businessDocument.isEmpty() -> etBusinessDocument.error = "Enter document reference"
                else -> {
                    Toast.makeText(this, "Verification request submitted", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        }

        btnBackVerification.setOnClickListener {
            finish()
        }
    }
}