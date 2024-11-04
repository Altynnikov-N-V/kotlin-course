package com.Nikita.lessons_12



fun main() {
    printMap(12,15)
}

fun sayHello() {
    println("Hello, world!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun multiply(a: Int, b: Int) = a * b

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

//Практика

fun doSump() {}

fun doSum1() = Unit //Функция не возвращает ничего

fun getUserName(): String {
    return ""
}

fun printGreeting(grit: String) {}

fun calcArea(area: Double, area1: Double): Double {
    return 1.1
}

fun findMax(ch1: Int, ch2: Int): Int {
    return 5
}

fun isNullEmpty(n: String?): Boolean {
    return false
}

fun calculateDiscount(disc: List<String>, arg: Int?): Double? {
    return null
}

fun summ(first: Double, sec: Double, flag: Boolean): Double {
    return if (flag) {
        first + sec
    } else {
        first - sec
    }
}

fun getMax(d: Int, e: Int) = if (d < e) d else e

fun printPositNumbers(a: List<Int>) {
    for (i in a) {
        if (i > 0) {
            println(i)
        } else return
    }
    println("Конец")
}

// Напишите функцию, которая принимает список строк и искомую строку,
//если она там есть, то ее заменить на эту же строка заглавную
fun replaseString(strings: MutableList<String>, str: String) {
    for (i in strings.indices) {
        if (strings[i] == str) {
            strings[i] = str.uppercase()
            return
        }
    }
}

private fun chekSize(xy: Int, result: String) {
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}

private fun createRange(size: Int): IntProgression {
    return if (size > 0) {
        0..size
    } else {
        0 downTo size
    }
}

fun printMap(xSize: Int, ySize: Int) {
    chekSize(xSize, "xSize")
    chekSize(ySize, "ySize")
    val formatterSize = " $xSize".length

    val xRange = createRange(xSize)
    val yRange = createRange(ySize)

    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}


