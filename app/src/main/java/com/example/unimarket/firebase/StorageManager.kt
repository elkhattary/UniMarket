package com.example.unimarket.firebase

import android.net.Uri
import com.google.firebase.storage.FirebaseStorage

class StorageManager {

    private val storage = FirebaseStorage.getInstance()
    private val storageRef = storage.reference

    fun uploadProductImage(
        imageUri: Uri,
        fileName: String,
        onSuccess: (String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val imageRef = storageRef.child("product_images/$fileName")

        imageRef.putFile(imageUri)
            .addOnSuccessListener {
                imageRef.downloadUrl
                    .addOnSuccessListener { uri ->
                        onSuccess(uri.toString())
                    }
                    .addOnFailureListener { exception ->
                        onFailure(exception.message ?: "Failed to get image URL")
                    }
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: "Image upload failed")
            }
    }
}