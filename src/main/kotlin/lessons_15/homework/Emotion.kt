package com.Nikita.lessons_15.homework

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        val description = when (type.lowercase()) {
            "радость" -> "Я чувствую радость"
            "грусть" -> "Я чувствую грусть"
            else -> "Я нихера не чувствую"
        }

        // Определение уровня интенсивности
        val intensityDescription = when {
            intensity <= 0 -> "слабо"
            intensity in 1..2 -> "сильно"
            else -> "очень сильно"
        }

        // Вывод описания эмоции
        println("$description с $intensityDescription выраженной интенсивностью.")
    }

}