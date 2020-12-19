package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question8.*

class Question8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question8)

        btn_backTo7.setOnClickListener {
            startActivityForResult(Intent(this,Question7::class.java),1)
        }
        btn_nextTo9.setOnClickListener {
            startActivityForResult(Intent(this,Question9::class.java),1)
        }
    }
}

