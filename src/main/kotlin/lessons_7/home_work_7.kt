package com.Nikita.lessons_7

//Задания для Цикла for
//Прямой Диапазон:
fun main () {
    println("Напишите цикл for, который выводит числа от 1 до 5.")
    for (i in 1..5) {
        println(i)
    }
    println("Напишите цикл for, который выводит четные числа от 1 до 10.")
    for (i in 1 .. 10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
//Обратный Диапазон:
    println("Создайте цикл for, который выводит числа от 5 до 1.")
    for (i in 5 downTo 1) {
        println(i)
    }
    println("Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
//С Шагом (step):
    println("Используйте цикл for с шагом 2 для вывода чисел от 1 до 9")
    for (i in 1 .. 9 step 2) {
        println(i)
    }
    println("Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20")
    for (i in 1 ..20 step 3) {
        println(i)
    }
//Использование До (until):
    println("Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается)")
    for (i in 1 until  9 ) {
        println(i)
    }
    println("Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15")
    for (i in 3 until 15) {
        println(i)
    }
//Задания для Цикла while
//Цикл while:
    println("Создайте цикл while, который выводит квадраты чисел от 1 до 5")
    var counter = 1
    while (counter++ <= 5) {
        println(counter * counter)
    }
    println("Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль")
    var count = 10
    while (count >= 5) {
        println(count)
        count--
    }
//Цикл do...while:
    println("Используйте цикл do...while, чтобы вывести числа от 5 до 1")
    var number = 5
    do {
        println(number)
        number--
    } while (number >= 1)
    println("Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5")
    var num = 5
    do {
        println(num)
        num++
    } while (num <= 10)

//Задания для Прерывания и Пропуска Итерации
//Использование break:
    println("Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6")
    for (i in 1 .. 10) {
        if ( i == 6) break
        println(i)
    }
    println("Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10")
    var n = 1
    while (true) {
        println(n)
        if (n >= 10) {
            break
        }
        n++
    }
//Использование continue:
    println("В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа")
    for (i in 1 .. 10) {
        if (i % 2 == 0) continue
        println(i)
    }
    println("Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3")
    var b = 1
    while (b <= 10) {
        if (b % 3 ==0) {
            b++
            continue
        }
        println(b)
        b++
    }
    println("Создать цикл в цикле, в каждом использовать диапазон от 1 до 10. В консоль вывести результат умножения " +
            "переменных цикла. Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом," +
            "чтобы отделять значения в строку. После вложенного цикла выводить пустой println() чтобы следующий " +
            "проход начинать с новой строки. Результат должен быть как на картинке.")
//Задача на вложенный цикл
//
    for (i in 1..10) {
        for (j in 1..10) { // Внутренний цикл
            print("${i * j} ") // Вывод результата умножения с пробелом
        }
        println()
    }
    println("Вывод чисел от 1 до 10: Напишите программу, которая выводит числа от 1 до 10 с использованием цикла while")
    var q = 1
    while (q <= 10) {
        println(q)
        q++
    }
    println("Четные числа до 20: Используя цикл while, выведите все четные числа от 2 до 20")
    var w = 2
    while (w <= 20) {
        println(w)
        w += 2
    }
    println("Сумма чисел от 1 до 50: Напишите программу, которая суммирует числа от 1 до 50 с помощью цикла while")
    var e = 1
    var sum = 0
    while (e <= 50) {
        sum = sum + e++
    }
    println(sum)

//    Вывод чисел от 10 до 1: Используя цикл do while, выведите числа от 10 до 1.
//    Факториал числа 5: Напишите программу, которая вычисляет факториал числа 5 с использованием цикла while.
//    Сумма четных чисел до 100: Используя цикл while, найдите сумму всех четных чисел от 2 до 100.
//    Таблица умножения на 3: Напишите программу, которая выводит таблицу умножения на 3.
//    Вывод символов до точки: Используя цикл do while, выведите символы строки "Kotlin." по одному до точки.
//    Наибольшее число из списка: Напишите программу, которая находит наибольшее число из заданного списка чисел с использованием цикла while.
//    Пример списка: [5, 12, 7, 22, 9]
//    Генерация чисел до 15: Используя цикл do while, напишите программу, которая генерирует и выводит числа от 1 до 15.
//    Простые числа до 20: Напишите программу, которая выводит все простые числа до 20 с использованием цикла while.
//    Обратный порядок элементов массива: Создайте массив из 10 элементов и выведите его элементы в обратном порядке с помощью цикла while.
//        Количество итераций до 100: Напишите программу, которая увеличивает счетчик на 1 в цикле while до тех пор, пока значение счетчика не достигнет 100. Выведите количество итераций.
//    Прямоугольник из символов: Используя вложенные циклы while, выведите прямоугольник размером 5x3 из символов *.
//    Числа Фибоначчи до 50: Напишите программу, которая выводит все числа Фибоначчи, не превышающие 50, с использованием цикла while.
//    Счетчик шагов: Создайте программу, которая считает шаги от 0 до 30 с шагом 5, используя цикл while.
//    Среднее значение фиксированного списка чисел: Найдите среднее значение чисел из списка [4, 8, 15, 16, 23, 42] с помощью цикла while.
//    Таблица умножения с вложенными циклами: Используя вложенные циклы do while, напишите программу для вывода таблицы умножения от 1 до 5.
//    Сумма чисел в диапазоне: Напишите программу, которая находит сумму чисел от 10 до 30 с использованием цикла while.
//    Сумма четных и нечетных чисел: Используя цикл while, найдите отдельно сумму четных и сумму нечетных чисел от 1 до 20.

}

