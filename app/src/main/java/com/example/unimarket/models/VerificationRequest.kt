package com.example.unimarket.models

data class VerificationRequest(
    val id: String = "",
    val sellerId: String = "",
    val status: String = "pending"
)