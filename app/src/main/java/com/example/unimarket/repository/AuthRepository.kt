package com.example.unimarket.repository

class AuthRepository {
    fun login(email: String, password: String): Boolean {
        return email.isNotEmpty() && password.isNotEmpty()
    }
}