package com.Nikita.lessons_18.homework.Printer

import com.Nikita.lesson_18.Background
import com.Nikita.lesson_18.Colors

class LaserPrinter(val text: String) : Printer() {
    fun printColored() {
        println("${Colors.RED}${Background.WHITE}${text.split(" ")}")
    }

    override fun print(text: String) {
    }
}