package com.example.unimarket.activities.admin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R
import com.example.unimarket.activities.auth.LoginActivity

class AdminDashboardActivity : AppCompatActivity() {

    private lateinit var btnVerifySellers: Button
    private lateinit var btnManageReports: Button
    private lateinit var btnManageReviews: Button
    private lateinit var btnLogoutAdmin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard)

        btnVerifySellers = findViewById(R.id.btnVerifySellers)
        btnManageReports = findViewById(R.id.btnManageReports)
        btnManageReviews = findViewById(R.id.btnManageReviews)
        btnLogoutAdmin = findViewById(R.id.btnLogoutAdmin)

        btnVerifySellers.setOnClickListener {
            startActivity(Intent(this, VerifySellersActivity::class.java))
        }

        btnManageReports.setOnClickListener {
            startActivity(Intent(this, ManageReportsActivity::class.java))
        }

        btnManageReviews.setOnClickListener {
            startActivity(Intent(this, ManageReviewsActivity::class.java))
        }

        btnLogoutAdmin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}