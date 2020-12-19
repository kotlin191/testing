package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question10.*

class Question10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question10)

        btn_backTo9.setOnClickListener {
            startActivityForResult(Intent(this,Question9::class.java),1)
        }
        btn_nextToTheReult.setOnClickListener {
            startActivityForResult(Intent(this,Result::class.java),1)
        }
    }
}
