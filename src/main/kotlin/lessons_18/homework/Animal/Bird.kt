package com.Nikita.lessons_18.homework.Animal

import com.Nikita.lesson_18.Colors

class Bird: Animal(){
    override fun makesound() {
        println("${Colors.GREEN}Tweet")
    }
}