package com.example.unimarket.models

data class Product(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val price: Double = 0.0,
    val sellerId: String = "",
    val imageUrl: String = ""
)