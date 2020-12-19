package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question9.*

class Question9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question9)

        btn_backTo8.setOnClickListener {
            startActivityForResult(Intent(this,Question8::class.java),1)
        }
        btn_nextTo10.setOnClickListener {
            startActivityForResult(Intent(this,Question10::class.java),1)
        }
    }
}


