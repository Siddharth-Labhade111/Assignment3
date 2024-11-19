package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project.assignmentno3.R

private var Nothing?.text: String
    get() {
        TODO("Not yet implemented")
    }
    set() = Unit

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // Retrieve the data sent from SecondActivity
        val finalData = intent.getStringExtra("finalData") ?: "No data received"

        // Set the data to the TextView
        val finalTextView = null
        finalTextView.text = finalData
    }
}
