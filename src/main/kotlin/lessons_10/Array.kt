package com.Nikita.lessons_10

fun main() {
//Работа с массивами Array
//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val array = arrayOf(1, 2, 3, 4, 5)
//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.
    val array1 = Array(10) {}
//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val arraySize = 5
    val doubleArray = DoubleArray(arraySize) { index ->
        (index * 2).toDouble()
    }
//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его
// индексу, умноженному на 3.
    val arraySize2 = 5
    val array2 = IntArray(arraySize2)
    for (index in array2.indices) {
        array2[index] = (index * 3)
    }
//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val emptyNullableArray: Array<String?> = arrayOf(null, "123", "3445")
//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val array3 = arrayOf(1, 2, 3, 4, 5)
    val newArray = Array(array3.size) { 0 }
    for (i in array3.indices) {
        newArray[i] = array3[i]
    }
//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val array4 = arrayOf(5, 6, 7, 8)
    val array5 = arrayOf(1, 2, 3, 4)
    val array6 = Array(4) { 0 }
    for (i in array6.indices) {
        array6[i] = array4[i] - array5[i]
    }
//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.
// Реши задачу через цикл while.
    val number = arrayOf(1, 2, 3, 4, 5, 6)
    var index = 0
    val foundIndex = -1
    while (index < number.size) {
        if (number[index] == 5) {
            foundIndex == index
            break
        }
        index++
    }
//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив
// каждого элемента должно быть написано “чётное” или “нечётное”.
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in numbers) {
        val parity = if (i % 2 == 0) "чётное" else "нечётное"
        println("$i: $parity")
    }
//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.
    val strings = arrayOf("window", "bicykle", "table", "month")
    val search = "ow"
    val result = findSubstring(strings, search)
    if (result != null) {
        println("Найденный элемент: $result")
    } else {
        println("Элемент не найден.")
    }

}
fun findSubstring(array: Array<String>, searchString: String): String? {
    for (element in array) {
        if (element.contains(searchString)) {
            return element
        }
    }
    return null
}
