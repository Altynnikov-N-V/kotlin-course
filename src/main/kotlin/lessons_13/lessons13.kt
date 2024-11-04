package com.Nikita.lessons_13

fun main() {
    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = myFilter(list)
    println(filtered1)

    //фильтр входящих значений
    val filtered2 = list.filter { it in 7..17 }
    println(filtered2)

    //filter - Фильтр согласно условиям
    val numbers = listOf(-1, 2, -3, 4, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers)

    //filterNot - фильтр обратного действия
    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers)

    //filterNotNull - фильтр nullable значений
    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList)

    //firstOrNull - отфильтрует список оставив только положительное значение, вернет первое значение из списка
    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive)

    //Получение данных
    //getOrElse - взять элемент по индексу и если индекса нет, вернуть значение
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse)

    //Преобразование
    //К каждому элементу + 1
    // val incrementedNumbers: List<Int> = numbers.map { it + 1 }
    //println(incrementedNumbers)
    //преобразование числа в строку
    val incrementedNumbers = numbers.map { "$it%" }
    println(incrementedNumbers)

    //associate - преобразует метод в словарь
    val numberSquareMap: Map<Int, Int> = numbers.associate { it to it * it }
    println(numberSquareMap)

    //Список внутри которого еще 2 списка
    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    println(multipleList)

    //flatten - склеивает списки в 1 общий список
    val flattenList = multipleList.flatten()
    println(flattenList)

    //flatMap - преобразование списки комбинирует в один
    val flattenListAfterMapping = multipleList.flatMap { list1: List<Int> ->
        list1.map { it * 2 }
    }
    println(flattenListAfterMapping)

    //joinToString - сборка в 1 общую строку
    val numbersString = numbers.joinToString(separator = ", ")
    println(numbersString)

    //Сортировка - создание нового отсортированного списка
    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)

    //Сортировка в обратном порядке
    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers)

    //Перебор как в цикле for
    numbers.forEach { println(it) }

    //Сумма элементов списка
    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers)

    //Посчитает сумму и разделит на количество и получит среднее значение
    val averageOfNumbers = numbers.average()
    println(averageOfNumbers)

    //Вернет максимальное значение из списка или null если список пуст
    val maxNumber = numbers.maxOrNull()
    println(maxNumber)

    //Вернет минимальное значение из списка или null если список пуст
    val minNumber = numbers.minOrNull()
    println(minNumber)

    //Сортировка в списки по ключу или по группе
    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign)

    //Вернет список из уникальных значений
    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers)

    //Возьмет первые несколько значений из списка
    val numbers1 = listOf(1, 2, 3, 4, 5)
    println(numbers1.take(3))

    //Создание нового списка с элементами значения
    val numbers2 = listOf(1, 2, 3, 4, 5)
    println(numbers2.takeLast(3))

    //Количество элементов списка
    println(numbers2.size)

    val numbers3 = listOf(1, 3, 5, 7)
    if (numbers.size < 5) {
        println("ок")
    }
    numbers3.isEmpty() //Проверка, что список пуст
    numbers3.isNotEmpty() //Проверка, что список не пуст
    //Взять, элемент по индексу, если индекса не существует, то дефолтное значение
    val defaultValue = numbers3.getOrElse(3) { 0 }
    println(defaultValue)

    //Создать список с определенными возрастами
    val millitory = listOf(17,28,35,75)
    println(millitory.filter { it in 18..35 })
}

//фильтрует список чисел по диапазону
fun myFilter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}
