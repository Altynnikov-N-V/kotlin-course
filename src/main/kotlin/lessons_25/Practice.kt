package com.Nikita.lessons_25

import com.Nikita.lessons_3.list

fun main() {
    val function1 = fun() {
        println("Hello world!")
    }
    val function2: () -> Unit = {
        println("Hello world!")
    }
    //Лямбда выражение
    val function5: (String) -> Int = {
        it.length
    }
    //Упрощенная запись лямбда выражения
    val function16 = { arg: String ->
        arg.length
    }

    //Анонимная функция
    val function3 = fun String.(a: Int, b: Int): Boolean {
        println(this)
        println(a)
        println(b)
        return a == b
    }
    //Лямбда выражение
    val function4: String.(Int, Int) -> Boolean = { a, b ->
        println(this)
        println(a)
        println(b)
        a == b
    }
    println("Hello world".function4(3, 5))

    //Анонимная функция
    val function10 = fun(list: List<Int>): Int {
        return list.filter { it > 0 }.sum()
    }
    //Лямбда выражение
    val function11: (List<Int>) -> Int = { list ->
        list.filter { it > 0 }.sum()
    }
    //Упрощенная запись лямбда выражения
    val function12 = { list: List<Int> ->
        list.filter { it > 0 }.sum()
    }
    //Анонимная функция
    val filterEven = fun Set<Int>.(): Set<Int> {
        return filter { it % 2 == 0 }.toSet()
    }
    //Лямбда выражение
    val filterEven1: Set<Int>.() -> Set<Int> = {
        filter { it % 2 == 0 }.toSet()
    }

    val set = setOf(1, 2, 3, 4, 5)
    println(set.filterEven1())
}

fun function1() {
    println("Hello world!")
}

fun function2(arg: String): Int {
    return arg.length
}

//Расширение класса String
fun String.function3(a: Int, b: Int): Boolean {
    println(this)
    println(a)
    println(b)
    return a == b
}

//ОТфильтровать числа больше 0 и сложить их все
fun function10(list: List<Int>): Int {
    return list.filter { it > 0 }.sum()
}

//Множество инт и фильтрует четные числа
fun Set<Int>.filterEven(): Set<Int> {
    return filter { it % 2 == 0 }.toSet()
}