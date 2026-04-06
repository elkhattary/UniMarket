package com.example.unimarket.activities.buyer

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class SearchActivity : AppCompatActivity() {

    private lateinit var etSearch: EditText
    private lateinit var btnSearchNow: Button
    private lateinit var lvProducts: ListView
    private lateinit var btnBackSearch: Button

    private val productList = arrayListOf(
        "Wireless Headphones",
        "Gaming Mouse",
        "Smart Watch",
        "Phone Case",
        "Laptop Stand"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        etSearch = findViewById(R.id.etSearch)
        btnSearchNow = findViewById(R.id.btnSearchNow)
        lvProducts = findViewById(R.id.lvProducts)
        btnBackSearch = findViewById(R.id.btnBackSearch)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, productList)
        lvProducts.adapter = adapter

        btnSearchNow.setOnClickListener {
            val query = etSearch.text.toString().trim()
            Toast.makeText(this, "Searching for: $query", Toast.LENGTH_SHORT).show()
        }

        lvProducts.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, ProductDetailsActivity::class.java)
            intent.putExtra("product_name", productList[position])
            startActivity(intent)
        }

        btnBackSearch.setOnClickListener {
            finish()
        }
    }
}