package com.example.unimarket.activities.seller

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class MyProductsActivity : AppCompatActivity() {

    private lateinit var lvMyProducts: ListView
    private lateinit var btnBackMyProducts: Button

    private val myProductsList = arrayListOf(
        "Wireless Headphones - RM 129.00",
        "Gaming Mouse - RM 89.00",
        "Phone Case - RM 25.00",
        "Laptop Stand - RM 55.00"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_products)

        lvMyProducts = findViewById(R.id.lvMyProducts)
        btnBackMyProducts = findViewById(R.id.btnBackMyProducts)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            myProductsList
        )
        lvMyProducts.adapter = adapter

        lvMyProducts.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                "Selected: ${myProductsList[position]}",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(Intent(this, EditProductActivity::class.java))
        }

        btnBackMyProducts.setOnClickListener {
            finish()
        }
    }
}