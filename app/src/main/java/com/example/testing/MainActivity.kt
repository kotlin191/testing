package com.example.testing

import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_quiz.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val TAG = MainActivity::class.java.simpleName
    }
    var quizs = listOf<Quiz>(
        Quiz(1, "心情最好是什麼時候?",
            listOf(Choice("早上", 1), Choice("中午", 2), Choice("晚上", 3))),
        Quiz(2, "心情最差是什麼時候?",
            listOf(Choice("早上", 1), Choice("中午", 2), Choice("晚上", 3))),
        Quiz(3, "吃最多是什麼時候?",
            listOf(Choice("早上", 1), Choice("中午", 2), Choice("晚上", 3))),
        Quiz(4, "XXX 是什麼時候?",
            listOf(Choice("早上", 1), Choice("中午", 2), Choice("晚上", 3))),
    )
    var current = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        setupQuiz()
        next.setOnClickListener {
            if (current < quizs.size-1) {
                current++
                setupQuiz()
            } else {
                showResult()
            }
        }
        previous.setOnClickListener {
            if (current > 0) current--
            setupQuiz()
        }
        choices.setOnCheckedChangeListener { group, checkedId ->
            Log.d(TAG, "onCreate: $checkedId")
            quizs.get(current).selected = checkedId-1
        }

        /*btn_start.setOnClickListener {
            startActivityForResult(Intent(this,Question1::class.java),1)
        }*/
    }

    private fun showResult() {
        var total = 0
        quizs.forEach { quiz ->
            if (quiz.selected != -1) {
                total = total + quiz.choices.get(quiz.selected).score
            }
        }
        AlertDialog.Builder(this)
            .setTitle("Score")
            .setMessage("Score: $total")
            .setPositiveButton("OK", null)
            .show()
    }

    private fun setupQuiz() {
        var quiz = quizs.get(current)
        choices.removeAllViews()
        quiz_title.setText(quiz.title)
        quiz.choices.forEachIndexed { index, it ->
            var choice = RadioButton(this)
            choice.setText(it.text)
            choice.id = index
            choices.addView(choice)
        }
    }
}
