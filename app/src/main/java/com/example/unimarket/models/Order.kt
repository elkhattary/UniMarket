package com.example.unimarket.models

data class Order(
    val id: String = "",
    val userId: String = "",
    val totalAmount: Double = 0.0,
    val status: String = "pending"
)