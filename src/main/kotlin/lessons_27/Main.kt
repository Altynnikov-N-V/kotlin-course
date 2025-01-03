package com.Nikita.lessons_27

//Набор расширений, которые позволяют сделать код кратким и более читальным
//run - Используется для выполнения блока кода с объектом и возвращает результат последнего выражения в блоке,
//а не сам объект.
//with - Позволяет выполнять блок кода с объектом, но также не возвращает объект.
//apply - Используется для инициализации объекта и возвращает сам объект. Внутри блока можно обращаться к его свойствам
// без явного указания имени объекта
//let - Передает объект как параметр в блок и возвращает результат последнего выражения.
// also — позволяет выполнять некоторые действия с объектом и возвращает сам объект после выполнения блока кода.
// Эта функция полезна для выполнения побочных эффектов, таких как логирование или валидация, при этом не изменяя сам
// объект.
//let - Передает объект как параметр в блок и возвращает результат последнего выражения

fun main() {
    val list = mutableListOf(1, 2, 3)

    println(list.size)
    list.add(3)
    println(list.size)

    val l: MutableList<Int>.() -> Unit = { //
        println(size)
        add(4)
        println(size)
    }

    with(list) { //Стандартная функция, которая используется для упрощения работы с объектами. Она позволяет вызывать
        // методы и свойства объекта без необходимости повторно указывать его имя. Это особенно полезно, когда нужно
        // выполнить несколько операций с одним и тем же объектом.

        println(size)
        add(4)
        println(size)
    }

    list.add(5)
    val result = list.sum()

    val result2 = list.run { //позволяет выполнять блок кода с контекстом определенного объекта
        add(5)
        sum()
    }

    //поток данных
//    val s = File("example.txt").inputStream() //Метод создает поток данных
//    val content = s.readBytes()
//    println(content)
//    s.close() //Необходимо закрывать потоки данных
//    File("example.txt").inputStream().use { //Объект работает как it и закрывать его не нужно
//        val content = it.readBytes()
//        println(content.size)
//    }

    val list3 = mutableListOf<Int>().apply {//
        add(1)
        add(2)
    }
    list3.also {
        println()
    }.add(3)

    val str: String? = "Hello"
    str?.let {
        println(it.length)  // Выполняется только если str не null
    }
}