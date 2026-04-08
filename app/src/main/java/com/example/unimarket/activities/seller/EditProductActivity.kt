package com.example.unimarket.activities.seller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class EditProductActivity : AppCompatActivity() {

    private lateinit var etEditProductName: EditText
    private lateinit var etEditProductDescription: EditText
    private lateinit var etEditProductPrice: EditText
    private lateinit var btnUpdateProduct: Button
    private lateinit var btnBackEditProduct: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_product)

        etEditProductName = findViewById(R.id.etEditProductName)
        etEditProductDescription = findViewById(R.id.etEditProductDescription)
        etEditProductPrice = findViewById(R.id.etEditProductPrice)
        btnUpdateProduct = findViewById(R.id.btnUpdateProduct)
        btnBackEditProduct = findViewById(R.id.btnBackEditProduct)

        etEditProductName.setText("Wireless Headphones")
        etEditProductDescription.setText("High quality product from trusted seller")
        etEditProductPrice.setText("129.00")

        btnUpdateProduct.setOnClickListener {
            val name = etEditProductName.text.toString().trim()
            val description = etEditProductDescription.text.toString().trim()
            val price = etEditProductPrice.text.toString().trim()

            when {
                name.isEmpty() -> etEditProductName.error = "Enter product name"
                description.isEmpty() -> etEditProductDescription.error = "Enter product description"
                price.isEmpty() -> etEditProductPrice.error = "Enter product price"
                else -> {
                    Toast.makeText(this, "Product updated successfully", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        }

        btnBackEditProduct.setOnClickListener {
            finish()
        }
    }
}