package com.Nikita.lessons_15.homework

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Место проведения $location")
        println("Количество гостей: $attendees")
    }
}
