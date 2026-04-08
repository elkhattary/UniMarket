package com.example.unimarket.models

data class Review(
    val id: String = "",
    val userId: String = "",
    val productId: String = "",
    val rating: Int = 0,
    val comment: String = "",
    val timestamp: Long = System.currentTimeMillis()
)