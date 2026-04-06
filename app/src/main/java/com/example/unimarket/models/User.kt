package com.example.unimarket.models

data class User(
    val id: String = "",
    val fullName: String = "",
    val email: String = "",
    val role: String = "buyer"
)