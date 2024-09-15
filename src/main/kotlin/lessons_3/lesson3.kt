package com.Nikita.lessons_3

class lesson3 {
}
// Неизменяемая перменная
val name: String = "Alice"

// Изменяемая переменная
var age: Int = 30

// Неизменяемое значение известное сразу
const val PI = 3.14

// Поздняя инициализация (позже принициализируется, данные запишутся позже)
lateinit var userInfo: String

// Ленивая инициализация (проинициализируется только тогда, когда обратимся к переменной)
val lazyValue: String by lazy {
    "Hello, this is a lazy string!"
}

// Вопросительный знак говорит, что переменная может быть null
var speed: Double? = null

// Изменяемая переменная(
var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    }
