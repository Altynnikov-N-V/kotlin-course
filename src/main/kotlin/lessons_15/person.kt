package com.Nikita.lessons_15

class Person(
    val name: String,
    var age: Int
) {
    fun sayHello() {
        println("Hello $name You are $age")
    }
}