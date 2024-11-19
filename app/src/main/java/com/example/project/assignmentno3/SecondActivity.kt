package com.example.project.assignmentno3


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity(var goToThirdActivity: ThirdActivity? = null) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val text1 = intent.getStringExtra("text1") ?: ""
        val text2 = intent.getStringExtra("text2") ?: ""
        val text3 = intent.getStringExtra("text3") ?: ""
        val text4 = intent.getStringExtra("text4") ?: ""
        val text5 = intent.getStringExtra("text5") ?: ""
        val booleanValue = intent.getBooleanExtra("booleanValue", false)
        val integerValue = intent.getIntExtra("integerValue", 0)
        val floatValue = intent.getFloatExtra("floatValue", 0.0f)

        val data = """
            $text1
            $text2
            $text3
            $text4
            $text5
            Boolean: $booleanValue
            Integer: $integerValue
            Float: $floatValue
        """.trimIndent()

        val textView = null
        textView.text = data
        Log.d("SecondActivity", data)

        goToThirdActivity?.setOnClickListener {
            val finalData = "Data: $text1, $text2, $text3, $text4, $text5. " +
                    "Boolean: $booleanValue, Integer: $integerValue, Float: $floatValue."
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("finalData", finalData)
            startActivity(intent)
        }
    }
}
