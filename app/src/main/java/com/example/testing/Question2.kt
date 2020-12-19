package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question2.*

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        btn_backTo1.setOnClickListener {
            startActivityForResult(Intent(this,Question1::class.java),1)
        }
        btn_nextTo3.setOnClickListener {
            startActivityForResult(Intent(this,Question3::class.java),1)
        }
    }
}
