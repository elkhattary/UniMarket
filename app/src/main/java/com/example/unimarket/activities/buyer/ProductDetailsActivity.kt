package com.example.unimarket.activities.buyer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class ProductDetailsActivity : AppCompatActivity() {

    private lateinit var tvProductName: TextView
    private lateinit var tvProductDescription: TextView
    private lateinit var tvProductPrice: TextView
    private lateinit var btnViewReviews: Button
    private lateinit var btnAddToCart: Button
    private lateinit var btnBackDetails: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        tvProductName = findViewById(R.id.tvProductName)
        tvProductDescription = findViewById(R.id.tvProductDescription)
        tvProductPrice = findViewById(R.id.tvProductPrice)
        btnViewReviews = findViewById(R.id.btnViewReviews)
        btnAddToCart = findViewById(R.id.btnAddToCart)
        btnBackDetails = findViewById(R.id.btnBackDetails)

        val productName = intent.getStringExtra("product_name") ?: "Wireless Headphones"

        tvProductName.text = productName
        tvProductDescription.text = "High quality product from a verified seller."
        tvProductPrice.text = "RM 129.00"

        btnViewReviews.setOnClickListener {
            startActivity(Intent(this, ReviewsActivity::class.java))
        }

        btnAddToCart.setOnClickListener {
            Toast.makeText(this, "$productName added to cart", Toast.LENGTH_SHORT).show()
        }

        btnBackDetails.setOnClickListener {
            finish()
        }
    }
}