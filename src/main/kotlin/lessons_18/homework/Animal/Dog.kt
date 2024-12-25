package com.Nikita.lessons_18.homework.Animal

import com.Nikita.lesson_18.Colors

class Dog : Animal() {
    override fun makesound(){
        println("${Colors.BLUE}Bark")
    }
}