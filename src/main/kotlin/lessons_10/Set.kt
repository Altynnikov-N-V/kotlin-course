package com.Nikita.lessons_10

fun main() {
//Работа с Множествами Set
//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.
    val emptySet = setOf<Int>()
//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val setNum = setOf(1, 2, 3)
//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java",
// "Scala").
    val language = mutableSetOf("Kotlin", "Java", "Scala")
//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    language.add("Swift")
    language.add("Go")
//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    language.remove("Java")
    println(language)
//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val setNumber = setOf(1, 2, 4, 5, 6, 7, 8, 9)
    for (i in setNumber) {
        println(i)
    }
//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    val languages = setOf("Kotlin", "Java", "Scala")
    println(findString(languages, "Java"))  // Вывод: true
    println(findString(languages, "Python"))
// Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих
// множеств. Реши задачу с помощью циклов.
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(4, 5, 6)
    val emptySet1 = mutableSetOf<Int>()
    for (i in set1) {
        emptySet1.add(i)
    }
    for (i in set2) {
        emptySet1.add(i)
    }
    println(emptySet1)
//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в
// первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.
    val set3 = setOf(1, 8, 15)
    val set4 = setOf(6, 8, 9)
    val differenceSet = difference(set3, set4)
    println("Разница множеств" + differenceSet)
//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.
//цикла
    val stringSet = setOf("Kotlin", "Java", "Python")
    val stringList = mutableListOf<String>()
    for (i in stringSet) {
        stringList.add(i)
    }
    println(stringList)
}

fun findString(setString: Set<String>, string: String): Boolean {
    for (i in setString)
        if (i == string) {
            return true
        }
    return false
}

fun difference(set3: Set<Int>, set4: Set<Int>): MutableSet<Int> {
    val result = mutableSetOf<Int>()
    for (i3 in set3) {
        var found = false
        for (i4 in set4) {
            if (i3 == i4) {
                found = true
                break
            }
        }
        if (!found) {
            result.add(i3)
        }
    }
    return result
}



