package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question7.*

class Question7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question7)

        btn_backTo6.setOnClickListener {
            startActivityForResult(Intent(this,Question6::class.java),1)
        }
        btn_nextTo8.setOnClickListener {
            startActivityForResult(Intent(this,Question8::class.java),1)
        }
    }
}





