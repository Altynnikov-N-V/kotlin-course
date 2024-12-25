package com.Nikita.lessons_15.homework

class Moon(val isVisible: Boolean, val phase: String) {
    fun showPhase() {
        if (isVisible) {
            println("Луна видима. Текущая фаза: $phase.")
        } else {
            println("Луна не видима.")
        }
    }
}