package com.example.testing

data class Quiz(var id: Int, var title: String, var choices: List<Choice>) {
    var selected = -1
}
data class Choice(var text: String, var score: Int)