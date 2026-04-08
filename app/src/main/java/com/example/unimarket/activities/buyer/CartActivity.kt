package com.example.unimarket.activities.buyer

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class CartActivity : AppCompatActivity() {

    private lateinit var lvCartItems: ListView
    private lateinit var btnProceedCheckout: Button
    private lateinit var btnBackCart: Button

    private val cartItems = arrayListOf(
        "Wireless Headphones - RM 129.00",
        "Phone Case - RM 25.00"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)


        lvCartItems = findViewById(R.id.lvCartItems)
        btnProceedCheckout = findViewById(R.id.btnProceedCheckout)
        btnBackCart = findViewById(R.id.btnBackCart)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cartItems)
        lvCartItems.adapter = adapter

        btnProceedCheckout.setOnClickListener {
            startActivity(Intent(this, CheckoutActivity::class.java))
        }

        btnBackCart.setOnClickListener {
            finish()
        }
    }
}