package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question3.*

class Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        btn_backTo2.setOnClickListener {
            startActivityForResult(Intent(this,Question2::class.java),1)
        }
        btn_nextTo4.setOnClickListener {
            startActivityForResult(Intent(this,Question4::class.java),1)
        }
    }
}
