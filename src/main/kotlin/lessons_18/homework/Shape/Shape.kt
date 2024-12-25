package com.Nikita.lessons_18.homework.Shape

abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}

fun main() {
    val geometry = listOf(Circle(3.3), Square(2.2, 3.3), Triangle(2.2, 2.2, 1.3))
    geometry.forEach { println(it.area()) }
}
