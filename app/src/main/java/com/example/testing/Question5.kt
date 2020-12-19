package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question5.*

class Question5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        btn_backTo4.setOnClickListener {
            startActivityForResult(Intent(this,Question4::class.java),1)
        }
        btn_nextTo6.setOnClickListener {
            startActivityForResult(Intent(this,Question6::class.java),1)
        }
    }
}
