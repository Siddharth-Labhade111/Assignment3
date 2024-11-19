package com.example.project.assignmentno3


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var goToSecondActivity: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onClickListener = goToSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text1", getString(R.string.text1))
            intent.putExtra("text2", getString(R.string.text2))
            intent.putExtra("text3", getString(R.string.text3))
            intent.putExtra("text4", getString(R.string.text4))
            intent.putExtra("text5", getString(R.string.text5))
            intent.putExtra("booleanValue", true)
            intent.putExtra("integerValue", 42)
            intent.putExtra("floatValue", 3.14f)
            startActivity(intent)
        }
    }
}
