package com.example.unimarket.activities.admin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class VerifySellersActivity : AppCompatActivity() {

    private lateinit var lvSellers: ListView
    private lateinit var btnBackSellers: Button

    private val sellersList = arrayListOf(
        "Seller #1 - TechStore88 - Pending Verification",
        "Seller #2 - BeautyHub - Pending Verification",
        "Seller #3 - GadgetWorld - Pending Verification",
        "Seller #4 - FashionTrend - Pending Verification"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_sellers)

        lvSellers = findViewById(R.id.lvSellers)
        btnBackSellers = findViewById(R.id.btnBackSellers)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            sellersList
        )
        lvSellers.adapter = adapter

        lvSellers.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                "Selected: ${sellersList[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnBackSellers.setOnClickListener {
            finish()
        }
    }
}