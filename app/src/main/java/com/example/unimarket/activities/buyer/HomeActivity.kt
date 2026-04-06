package com.example.unimarket.activities.buyer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R
import com.example.unimarket.activities.auth.LoginActivity
import com.example.unimarket.activities.common.ProfileActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var btnSearch: Button
    private lateinit var btnProductDetails: Button
    private lateinit var btnCart: Button
    private lateinit var btnProfile: Button
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnSearch = findViewById(R.id.btnSearch)
        btnProductDetails = findViewById(R.id.btnProductDetails)
        btnCart = findViewById(R.id.btnCart)
        btnProfile = findViewById(R.id.btnProfile)
        btnLogout = findViewById(R.id.btnLogout)

        btnSearch.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        btnProductDetails.setOnClickListener {
            startActivity(Intent(this, ProductDetailsActivity::class.java))
        }

        btnCart.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }

        btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        btnLogout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}