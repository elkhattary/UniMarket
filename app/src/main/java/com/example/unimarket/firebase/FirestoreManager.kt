package com.example.unimarket.firebase

import com.example.unimarket.models.Product
import com.example.unimarket.models.User
import com.google.firebase.firestore.FirebaseFirestore

class FirestoreManager {

    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun saveUser(
        userId: String,
        user: User,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        db.collection("users")
            .document(userId)
            .set(user)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: "Failed to save user")
            }
    }

    fun getUser(
        userId: String,
        onSuccess: (User?) -> Unit,
        onFailure: (String) -> Unit
    ) {
        db.collection("users")
            .document(userId)
            .get()
            .addOnSuccessListener { document ->
                val user = document.toObject(User::class.java)
                onSuccess(user)
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: "Failed to get user")
            }
    }

    fun saveProduct(
        productId: String,
        product: Product,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        db.collection("products")
            .document(productId)
            .set(product)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: "Failed to save product")
            }
    }

    fun deleteProduct(
        productId: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        db.collection("products")
            .document(productId)
            .delete()
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: "Failed to delete product")
            }
    }
}