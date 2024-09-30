package com.Nikita.lessons_5

import org.intellij.lang.annotations.Language

fun main() {
    val sum = 10 + 5
    val diff = 10 - 5
    val product = 10 * 5
    val quotient = 10 / 5
    val remainder = 10 % 4
    val isEqual = (5 == 1)
    val isNotEqual = (5 != 5)
    val isGreater = (5 > 3)
    val isLesser = (5 < 3)
    val isGreateOrEqual = (5 >= 5)
    val isLesserOrGreate = (5 <= 3)
    val andResult = true && true //И, если ложь-всегда ложь, все должны быть TRUE чтобы получить TRUE
    val orResult = true || false //ИЛИ, всегда true если есть true
    //если вместе && и ||, то первым считается &&
    val notResult = !(5 > 3) //! переворачивает значение
    var number = 5 //Присваивание
    number += 3 //Присваивание с увеличением
    number -= 2 //Присвавание с уменьшением
    number++ //Инкремент
    number-- //Декремент
    //Оператор Элвиса
    val name: String? = null
    val result = name ?: "Unknown"
    // Если name == null, то в этом случае вернуть Unknown
    println(result)
    printPrice(123.8, null)
    printPrice(100.0, 10)
    printSiteLang("RUS")
    printSiteLang(null)
    controlBox( "Z")
    controlBox(null)

}
//Расчитать стоимость товара со скидкой
fun printPrice(price: Double, s: Int?){
    val koef = (100 - (s ?: 0))/100.0
    println(price * koef)
}
//Вернуть язык интерфейса для сайта, если пользователь не установил язык, то вернуть дефолтный

fun printSiteLang(lang: String?) {
    val defaultLang: String = "Eng"
    println(lang ?: defaultLang)
}
// Вы работаете на складе и вам необходимо проверить что в ящике что-то есть

fun controlBox(stuff: String?){
    println(stuff ?: throw Exception("Box is empty"))
}