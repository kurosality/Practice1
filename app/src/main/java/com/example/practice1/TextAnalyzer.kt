package com.example.practice1
class TextAnalyzer(private val text: String) {

    fun findLongestSentence(): String {
        val sentences = text.split(". ", "? ", "! ")
        var longestSentence = ""
        var maxWords = 0

        for (sentence in sentences) {
            val words = sentence.split(" ")
            if (words.size > maxWords) {
                maxWords = words.size
                longestSentence = sentence
            }
        }

        return longestSentence
    }
}
