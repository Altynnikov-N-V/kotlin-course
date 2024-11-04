package com.Nikita.lessons_10

fun main() {
    //Массивы - всегда изменяемые
    val number: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    val emptyArray = Array(5) { "" } //Массив из 5 ячеек, с пустыми ячейками
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5) //Заполнит все null
    println(doubles[2])

    //Списки - могут быть изменяемыми и неизменяемыми
    val readOnlyList: List<String> = listOf("a", "b", "c") //listOf - Неизменяемый список
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") //Изменяемый список
    mutableList.add("ui") //Добавление в список
    println(mutableList[3])

    //Множества
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) //Неизменяемое множество
    val mutableNumberSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5) //Изменяемое множество

    val set = setOf("K", "o", "t", "l", "i", "n")

    for (letter in set) {
        println("| $letter |")
    }
    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }
    var index = list.lastIndex //Можно перебирать только списки и массивы
    while (index >= 0) {
        println("`${list[index--]}`")
    }
    println("Практика")
    //Создать массив 10 элементов заполненного 0
    val emptyArray1 = Array(10) { 0 }
    //Массив от 1 до 5 дабл
    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    //Массив из 10 элементов типа инт и используй цикл for и заполни от 10 до 100
    val array1 = Array(10) { 0 }
    array1[0] = 10
    for (i in array1.indices) {
        array1[i] = (i + 1) * 10
    }
    println(array1.toList())
    //Создай массив из 5 строк, заменить все строки на пустую строку
    val array2 = arrayOf("qwe", "qweqwe", "qweqwe", "qweqwe", "qweqwe")
    for (i in array2.indices) {
        array2[i] = " "
    }
    println(array2.toList())
    //Сложение элементов двух массивов
    val array3 = arrayOf(1, 2, 3)
    val array4 = arrayOf(4, 5, 6)
    val array5 = Array(3) { 0 }
    for (i in array5.indices) {
        array5[i] = array3[i] + array4[i]
    }
    println(array5.toList())
    //Создать пустой неизменяемый список целых чисел
    val list1 = listOf<Int>()
    //Создать список строк содержащий 3 элемента с любыми значениями
    val list2 = listOf("1qweqe", "2qweqe", "3qweqewqwe")
    //Создать пустой изменяемый список с элементами float
    val mutableList1 = mutableListOf<Float>()
    //Добавить пару значений в список
    mutableList1.add(1.1F)
    mutableList1.add(30F)
    //Удалить значение
    mutableList1.remove(30f)
    println(mutableList1)
    //Удаление по индексу
    mutableList1.removeAt(0)
    println(mutableList1)
    //Распечатать в цикле значение списка
    for (i in list2) {
        println(i)
    }
    //Создать пустое множество неизменяемых целых цисел
    val emptySet = setOf<Int>()
    //Создать неизменяемое множество с 5 числами
    val setNum = setOf(1, 2, 3, 4, 5)
    //Создать изменяемое множество с 3 числами
    val setNum2 = mutableSetOf(1, 2, 3)
    //Добавить в множество число
    setNum2.add(6)
    //Удалить число из множества
    setNum2.remove(2)
    println(setNum2)
    //Вывести квадрат каждого числа через цикл
    for (i in setNum2) {
        println(i * i)
    }
    //Создать 2 множества и объединить в 1
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(8, 4, 5, 6, 7)
    val emptySet1 = mutableSetOf<Int>()

    for (i in set1) {
        emptySet1.add(i)
    }
    for (i in set2) {
        emptySet1.add(i)
    }
    println(emptySet1)

}

//В множестве найти число
fun findNumber(setNum: Set<Int>, num: Int): Boolean {
    for (i in setNum)
        if (i == num) {
            return true
        }
    return false
}
