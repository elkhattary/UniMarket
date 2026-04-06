package com.example.unimarket.models

data class Review(
    val id: String = "",
    val productId: String = "",
    val userId: String = "",
    val comment: String = "",
    val rating: Int = 0,
    val trusted: Boolean = false
)