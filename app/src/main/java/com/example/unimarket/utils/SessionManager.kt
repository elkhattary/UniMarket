package com.example.unimarket.utils

import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("unimarket_session", Context.MODE_PRIVATE)

    fun saveUser(email: String, role: String) {
        prefs.edit()
            .putString("email", email)
            .putString("role", role)
            .putBoolean("is_logged_in", true)
            .apply()
    }

    fun isLoggedIn(): Boolean {
        return prefs.getBoolean("is_logged_in", false)
    }

    fun getEmail(): String {
        return prefs.getString("email", "") ?: ""
    }

    fun getRole(): String {
        return prefs.getString("role", "buyer") ?: "buyer"
    }

    fun logout() {
        prefs.edit().clear().apply()
    }
}