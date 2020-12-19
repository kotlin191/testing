package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_question1.*

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)
        btn_back.setOnClickListener {
            startActivityForResult(Intent(this,MainActivity::class.java),1)
        }
        btn_next.setOnClickListener {
            startActivityForResult(Intent(this,Question2::class.java),1)
        }
    }
}
