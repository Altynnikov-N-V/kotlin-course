package com.Nikita.lessons_15

class Lampe(var isOn: Boolean) {
    fun switch() {
        isOn = !isOn
        println(isOn)
    }
}