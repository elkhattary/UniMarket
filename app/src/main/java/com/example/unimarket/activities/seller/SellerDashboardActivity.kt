package com.example.unimarket.activities.seller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R
import com.example.unimarket.activities.auth.LoginActivity
import com.example.unimarket.activities.common.ProfileActivity

class SellerDashboardActivity : AppCompatActivity() {

    private lateinit var btnAddProduct: Button
    private lateinit var btnEditProduct: Button
    private lateinit var btnMyProducts: Button
    private lateinit var btnSellerVerification: Button
    private lateinit var btnSellerProfile: Button
    private lateinit var btnSellerLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller_dashboard)

        btnAddProduct = findViewById(R.id.btnAddProduct)
        btnEditProduct = findViewById(R.id.btnEditProduct)
        btnMyProducts = findViewById(R.id.btnMyProducts)
        btnSellerVerification = findViewById(R.id.btnSellerVerification)
        btnSellerProfile = findViewById(R.id.btnSellerProfile)
        btnSellerLogout = findViewById(R.id.btnSellerLogout)

        btnAddProduct.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }

        btnEditProduct.setOnClickListener {
            startActivity(Intent(this, EditProductActivity::class.java))
        }

        btnMyProducts.setOnClickListener {
            startActivity(Intent(this, MyProductsActivity::class.java))
        }

        btnSellerVerification.setOnClickListener {
            startActivity(Intent(this, SellerVerificationActivity::class.java))
        }

        btnSellerProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        btnSellerLogout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}