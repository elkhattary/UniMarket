package com.example.unimarket.activities.seller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class AddProductActivity : AppCompatActivity() {

    private lateinit var etProductName: EditText
    private lateinit var etProductDescription: EditText
    private lateinit var etProductPrice: EditText
    private lateinit var btnSaveProduct: Button
    private lateinit var btnBackAddProduct: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        etProductName = findViewById(R.id.etProductName)
        etProductDescription = findViewById(R.id.etProductDescription)
        etProductPrice = findViewById(R.id.etProductPrice)
        btnSaveProduct = findViewById(R.id.btnSaveProduct)
        btnBackAddProduct = findViewById(R.id.btnBackAddProduct)

        btnSaveProduct.setOnClickListener {
            val name = etProductName.text.toString().trim()
            val description = etProductDescription.text.toString().trim()
            val price = etProductPrice.text.toString().trim()

            when {
                name.isEmpty() -> etProductName.error = "Enter product name"
                description.isEmpty() -> etProductDescription.error = "Enter product description"
                price.isEmpty() -> etProductPrice.error = "Enter product price"
                else -> {
                    Toast.makeText(this, "Product added successfully", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        }

        btnBackAddProduct.setOnClickListener {
            finish()
        }
    }
}