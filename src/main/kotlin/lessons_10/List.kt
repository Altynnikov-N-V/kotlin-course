package com.Nikita.lessons_10


fun main() {

//Работа со списками List
//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.
    val emptyList: List<Int> = listOf()
//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val readOnlyList = listOf<String>("Hello", "World", "Kotlin")

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val mutableList1 = mutableListOf("Hello", "World", "Kotlin")
    mutableList1.remove("World")
//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list = listOf(1, 2, 3, 4, 5, 5, 6, 7)
    for (i in list) {
        println(i)
    }
//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.
    val stringList = listOf("Привет", "дорогой", "Друг")
    println(stringList[1])
//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент
// на позиции 2 на новое значение).
    val numberList = mutableListOf(10, 20, 30, 40, 50)
    val i = 2
    val newValue = 99
    numberList[i] = newValue
//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с
// помощью циклов.
    val list1 = listOf("Ручка", "Карандаш", "Фломастер")
    val list2 = listOf("Стол", "Велоспиед", "Машина")
    val combinedList = mutableListOf<String>()
    for (item in list1) {
        combinedList.add(item)
    }
    for (item in list2) {
        combinedList.add(item)
    }
//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val number = listOf(1, 2, 3, 4, 5, 2, 1)
    var min = number[0]
    var max = number[0]
    for (num in number) {
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
    }
//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val numbers = listOf(1, 2, 3, 81, 13, 24, 33)
    val evenNumbers = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) { // Проверка на четность
            evenNumbers.add(number) // Добавление четного числа в новый список
        }
    }

}