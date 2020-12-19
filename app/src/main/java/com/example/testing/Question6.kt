package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question6.*

class Question6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question6)

        btn_backTo5.setOnClickListener {
            startActivityForResult(Intent(this,Question5::class.java),1)
        }
        btn_nextTo7.setOnClickListener {
            startActivityForResult(Intent(this,Question7::class.java),1)
        }
    }
}
