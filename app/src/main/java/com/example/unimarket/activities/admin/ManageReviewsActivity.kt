package com.example.unimarket.activities.admin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class ManageReviewsActivity : AppCompatActivity() {

    private lateinit var lvReviews: ListView
    private lateinit var btnBackReviews: Button

    private val reviewsList = arrayListOf(
        "Review #1 - Great product, trusted review",
        "Review #2 - Suspicious duplicate comment",
        "Review #3 - Product quality issue",
        "Review #4 - Fake review suspected"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_reviews)

        lvReviews = findViewById(R.id.lvReviews)
        btnBackReviews = findViewById(R.id.btnBackReviews)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            reviewsList
        )
        lvReviews.adapter = adapter

        lvReviews.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                "Selected: ${reviewsList[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnBackReviews.setOnClickListener {
            finish()
        }
    }
}