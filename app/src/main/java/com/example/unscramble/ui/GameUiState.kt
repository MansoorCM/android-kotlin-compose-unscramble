package com.example.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val wordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false
)
