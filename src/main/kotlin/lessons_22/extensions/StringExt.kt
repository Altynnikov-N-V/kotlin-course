package com.Nikita.lessons_22.extensions

//Функция расширения класса
fun String.removeSpaces(): String {
    return replace(" ", "")
}