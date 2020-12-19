package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question4.*

class Question4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        btn_backTo3.setOnClickListener {
            startActivityForResult(Intent(this,Question3::class.java),1)
        }
        btn_nextTo5.setOnClickListener {
            startActivityForResult(Intent(this,Question5::class.java),1)
        }
    }
}



