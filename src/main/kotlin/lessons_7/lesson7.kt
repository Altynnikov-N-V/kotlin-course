package com.Nikita.lessons_7

fun main() {
    for (i in 1..10 step 2) { //for - перебирает все значения, step = шаг диапазона
        println(i)
    }
    for (i in 1 until 10) { //until = крайнее значение не будет включено
        println(i)
    }
    val range = 1..5
    for (i in range) {
        println(i)
    }
    var counter = 10 //Выполняется пока, выполняется условие
    while (counter-- > 0) { //пока counter > 0, будет выполняться условие
        println(counter)
    }
    do {         //Сначала выполняется тело цикла
        println("+")
    } while (false) //Далее выполняется проверка, выполнится хотя бы 1 раз

    for (i in 1..10) {
        if (i == 2) continue //Значение пропустилось
        if (i == 7) break //Завершает цикл совсем
        println(i)
    }
    println("Практические задачи")
    for (i in 1..10) {
        println(i)
    }
    // Вывести квадраты чисел от 1 до 5
    for (i in 1 ..5) {
        println(i * i)
    }
    // Цикл чисел от 10 до 1
    for (i in 10 downTo 1) {
        println(i)
    }
    // Цикл с убывающей последовательностью от 20 до 2
    for (i in 20 downTo 2) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    // Цикл каждое третье число от 1 до 30
    for (i in 1..30 step 3) {
        println(i)
    }
    // Цикл While суммирует числа от 1 до 10
    var count = 1
    var sum = 0
    while (count <= 10) {
        sum = sum + count++
    }
    println(sum)

    //Цикл While который считается количество цифр в цисле начиная от 100 и уменьшая его на1 после каждой итерации
    var a = 100
    while (a > 1)
        println(a--.toString().length)

}

// 1:56:15