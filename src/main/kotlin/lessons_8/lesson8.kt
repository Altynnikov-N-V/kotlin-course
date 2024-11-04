package com.Nikita.lessons_8
fun main () {
    val simpleString = "Это простая строка"

    val firstName = "Ivan"
    val lastName = "Ivanov"
    val fullName = "$firstName $lastName"
    println(fullName)

    val age = 30
    val greeting = "Привет! Меня зовут $firstName, и мне $age лет." //Шаблоны
    println(greeting)

    val person = Person("Alexey", 25)
    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет."
    println(introduction)

    val details = "Здесь находятся ${getDetails()}"
    println(details)

    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
    println(resultString)

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7) //Подстрока, позволяет выбирать часть из оригинальной строки
    val subString2 = originalString.substring(3, 6) //3 - попадает, 6 - нет
    //Замена, первое значение находит, второе заменяет
    val replacedString = originalString.replace("fun", "awesome")
    //Разделение строки на список, delimiters - сущность по которой происходит разделение
    val words = originalString.split(" ")
    //Длина слова
    val length = "Hello".length
    //Перевод всех букв в верхний регистр
    val upper = "hello".uppercase()
    //Перевод всех букв в нижний регистр
    val lower = "HELLO".lowercase()
    // Обрезает пробелы по краям
    val trimmed = "   привет    ".trim()
    //Выполняет проверку и возвращает true или false, начинается ли строка с этого префикса
    val starts = "Kotlin".startsWith("Kot")
    //Проверяет как заканчивается строка на суффикс
    val ends = "Kotlin".endsWith("lin")
    //Нахождение подстроки в строке
    val contains = "Hello".contains("ell")
    //Проверяет что строка null или не содержит в себе данных
    val e: String? = null
    val empty = e.isNullOrEmpty()
    //Отсутствие значимых символов
    val blank = " ".isNullOrBlank()
    //Повторить строку 3 раза
    val repeat = "ab".repeat(3)
    //Взять из списка по индексу
    val letter = originalString[3]
    //Возврат индекса первого вхождения в строку
    val indexOfChar = "Kotlin".indexOf("t")
    //Вхождение по целой строке
    val indexOfWord = "Kotlin ie the best language".indexOf("best")
    //Возврат строки в обратном направлении
    val backReverse = "niltok".reversed()
//Многострочные переменные, убирает лишние пробелы
    val multiLineString = """
        Первая строка
        Вторая строка
        Третя строка
    """.trimIndent()

    val name = "Alexey"
    val city = "Moscow"
    val age1 = 32
    val friendsCount = 1052
    val rating = 4.928
    val balance = 2534.75856
    val text = """
    Имя: %s
    Город: %s
    Возраст: %d
    Количество друзей: %,d
    Рейтинг пользователя: %.1f
    Баланс счета: $%,.2f
    """.trimIndent()

    println(subString)
    println(subString2)
    println(replacedString)
    println(words)
    println(length)
    println(upper)
    println(lower)
    println(trimmed)
    println(starts)
    println(ends)
    println(contains)
    println(empty)
    println(repeat)
    println(letter)
    println(indexOfChar)
    println(indexOfWord)
    println(backReverse)
    println(multiLineString)
    println(text.format(name, city, age1, friendsCount, rating, balance))

    println(convert("Для завершения проекта важно"))
//Вернуть фрагмент из строки
    var text1 = "Kotlin: The Fun Way to Learn Programming"
    println(text1.substring(8,19))
    //Строка Электронной почты, выдели домен
    var text2 = "contact@example.com"
    println(text2.substring(8))
    var indexOfAt = text2.indexOf("@")
    println(text2.substring(indexOfAt+1))
    //Сделать так, чтобы номер телефона выводился в другом формате
    val numb = "123-456-7890"
    val subString1 = numb.substring(8)
    println("XXX-XX-$subString1")
}
class Person(val name: String, val age: Int)

fun getDetails(): String {
    return "очень интересные детали"
}
fun convert(string: String): String {//Функция должна принимать строку и возвращать ее
    return when {
        string.startsWith("ошибка", true) -> string.replace(
            "ошибка", "небольшое " +
                    "недоразумение", true
        ) //Регистр учитываться не будет
        string.endsWith("важно", true) -> "$string ... но не критично"
        else -> ""
    }
}