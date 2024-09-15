package com.Nikita.lessons_4

import javax.sound.midi.MetaMessage

class lesson4 {
}
val myInt: Int = 5
val myFloat: Float = 0.58F
val myLong: Long= 1_234_567_890L
val myShort: Short = 32000
val myByte: Byte = 120
val myDouble: Double = 5.99
val isKotlinFun: Boolean = true
val letter: Char = 'A'
val text: String = "AS"
//Коллекции
val numbers: Array<Int> = arrayOf(1, 2, 3)
val string: MutableList<String> = mutableListOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56.8)
// Словари
val keysToValues: Map<String, String> = mapOf(
    "Ключ 1" to "Значение 1",
    "Ключ 2" to "Значение 2",
)

val anything: Any = false

fun ptintMessage(message: String): Unit {
    println(message)
}
// Этот код не используется
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
