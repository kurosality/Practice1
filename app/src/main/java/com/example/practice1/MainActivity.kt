package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editText)

        button.setOnClickListener {
            val inputText = editText.text.toString()
            if (inputText.isNotEmpty()) {
                val analyzer = TextAnalyzer(inputText)
                val result = analyzer.findLongestSentence()
                textView.text = "Результат: $result"
            } else {
                textView.text = "Пожалуйста, введите текст."
            }
        }
    }
}
