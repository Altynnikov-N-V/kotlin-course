package com.Nikita.lessons_18.homework.Printer

import com.Nikita.lesson_18.Background
import com.Nikita.lesson_18.Colors

abstract class Printer {
    abstract fun print(text: String)
}

fun main (){
    val text = LaserPrinter("Все будет офигенно")
    text.run {
        printColored()
    }
}