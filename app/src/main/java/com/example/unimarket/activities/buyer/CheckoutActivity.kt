package com.example.unimarket.activities.buyer

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class CheckoutActivity : AppCompatActivity() {

    private lateinit var tvCheckoutSummary: TextView
    private lateinit var btnPlaceOrder: Button
    private lateinit var btnBackCheckout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        tvCheckoutSummary = findViewById(R.id.tvCheckoutSummary)
        btnPlaceOrder = findViewById(R.id.btnPlaceOrder)
        btnBackCheckout = findViewById(R.id.btnBackCheckout)

        tvCheckoutSummary.text = "Order Total: RM 154.00\nPayment Method: Cash on Delivery"

        btnPlaceOrder.setOnClickListener {
            Toast.makeText(this, "Order placed successfully", Toast.LENGTH_SHORT).show()
        }

        btnBackCheckout.setOnClickListener {
            finish()
        }
    }
}