package com.Nikita.lessons_6

fun main () {
    val number = 3
    if (number > 5) {
        println("Число больше 5")
    } else {
        println("Число меньше или равно 5")
    }
    val num: Int = 0
    if (num < 0) {
        println("Число отрицательное")
    } else if (num == 0) {
        println("Число равно 0")
    } else {
        println("Число положительное")
    }
    val intRange: IntRange = 1..10 // диапазон от 1 до 10 вверх
    val intRangeUntil = 1 until 10 // диапазон от 1 до 10 не включительно
    val downTo = 10 downTo 1 // диапазон убывания от 10 до 1 включительно
    val charRange: CharRange = 'd'..'r' //диапазон по символам
    val inRange = 2 in intRange //проверка, что число входит в диапазон
    val notInRange = 2 !in intRange //число не находится в диапазоне
    println(intRange)
    println(inRange)

    val score = 65
    when (score) {
        in 90..100 -> println("Отлично")
        in 80..89 -> println("Хорошо")
        in 70..79 -> println("Удовлетворительно")
        else -> println("Нужно подучить")
    }
}
    // Если проверка 1 или вложенные алгоритмы, то использовать if else
    // если проверок много, то when

fun getTimeOfDay(hour: Int): String {
    return if (hour < 0 || hour > 23) {
        "Неверное значение времени"
    } else if (hour in 0 .. 4) {
        "Ночь"
    } else if (hour in 5 .. 11) {
        "Утро"
    } else if (hour in 12 .. 16) {
        "День"
    } else {
        "Вечер"
    }
}
fun getTimeOfDay2(hour: Int): String {
    return when {
        hour < 0 || hour > 23 -> "Неверное значение времени"
        hour in 0 .. 4 -> "Ночь"
        hour in 5 .. 11 -> "Утро"
        hour in 12 .. 16 -> "День"
        else -> "Вечер"
    }
}
//Проверка пароля, если количество символов больше 8 верни тру
fun checkPassword (password: String): Boolean {
    if (password.length <= 8 ) return false
    //if (checkSymbol(password)) return true
    //return false
    return checkSymbol(password)
}

fun checkSymbol (password: String) : Boolean {
    return false
}
// Напишите функцию, где число принимает от 0 до 100 и верните оценку где A до F
fun convertMark (mark: Int): String {
    return when(mark) {
        in 0 .. 20 -> "F"
        in 21 .. 40 -> "E"
        in 41 .. 60 -> "D"
        in 61 .. 80 -> "C"
        in 81 .. 90->"B"
        in 91 .. 100->"A"
        else -> "invalid mark"
    }
}