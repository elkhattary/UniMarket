package com.example.unimarket.activities.buyer

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class ReviewsActivity : AppCompatActivity() {

    private lateinit var lvReviews: ListView
    private lateinit var btnBackReviews: Button

    private val reviewsList = arrayListOf(
        "5★ - Great product and fast delivery",
        "4★ - Good quality, trusted seller",
        "3★ - Product was okay, packaging could improve",
        "5★ - Verified purchase, highly recommended"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)

        lvReviews = findViewById(R.id.lvReviews)
        btnBackReviews = findViewById(R.id.btnBackReviews)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, reviewsList)
        lvReviews.adapter = adapter

        btnBackReviews.setOnClickListener {
            finish()
        }
    }
}