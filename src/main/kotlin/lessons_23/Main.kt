package com.Nikita.lessons_23

fun main() {
    val obj: Any = "Hello, World!"
    if (obj is String) {
        println("Объект является строкой")
    }
    if (obj is Int) {
        println("Объект не является целым числом")
    }
    if (obj is String) {// obj автоматически приведён к String
        println(obj.uppercase()) //Метод toUpperCase () доступен, т.к. obj теперь String
    }

    val num: Any = 123
    //val str: String = num as String //Преобразование в новый тип

    val safeStr: String? = num as? String
    println(safeStr)

    val nullableStr: String? = "Kotlin"
    val nonNullableStr: String = nullableStr as String
    println(nonNullableStr)

    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)

    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип $item")
        }
    }
    val flyingCar = FlyingCar()
    val car = Car()
    checkCapabilities(flyingCar)
    checkCapabilities(car)

    val i: Any = "sdd"
    println(i as String)
    //println(i as Int)

    if (i is String) {
        println(i)
    } else {
        println("Не строка")
    }

    if (i is Int) {
        println(i)
    } else {
        println("Не число")
    }
    println(i as? Int ?: "Не номер")


    val j: Any = listOf("sdsd", "sdsd", "asdasd")
    println(j as List<Int>)

    if (j is List<*>) {
        (j[0] as String).length
    }
    val x: String? = null
    println(x as? String)


}

interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class FlyingCar : Drivable, Flyable {
    override fun drive() {
        println("Едет как автомобиль")
    }

    override fun fly() {
        println("Летит как самолёт")
    }
}

class Car : Drivable {
    override fun drive() {
        println("Едет как автомобиль")
    }
}

fun checkCapabilities(drivable: Drivable) {
    drivable.drive()

    if (drivable is Flyable) {
        println("Этот объект также может летать!")
        drivable.fly()
    } else {
        println("Этот объект не может летать.")
    }
}

