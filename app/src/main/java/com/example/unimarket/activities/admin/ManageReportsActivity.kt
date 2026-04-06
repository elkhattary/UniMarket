package com.example.unimarket.activities.admin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unimarket.R

class ManageReportsActivity : AppCompatActivity() {

    private lateinit var lvReports: ListView
    private lateinit var btnBackReports: Button

    private val reportsList = arrayListOf(
        "Report #1 - Fake seller profile",
        "Report #2 - Misleading product information",
        "Report #3 - Suspicious review activity",
        "Report #4 - Scam complaint"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_reports)

        lvReports = findViewById(R.id.lvReports)
        btnBackReports = findViewById(R.id.btnBackReports)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            reportsList
        )
        lvReports.adapter = adapter

        lvReports.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                "Selected: ${reportsList[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnBackReports.setOnClickListener {
            finish()
        }
    }
}