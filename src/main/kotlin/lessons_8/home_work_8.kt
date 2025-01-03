package com.Nikita.lessons_8

import java.util.concurrent.Phaser

fun main () {
//    Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая
    //    текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия
    //    и соответственно изменять фразу.
//    Правила Проверки и Преобразования:
//    Если фраза содержит слово "невозможно":
//    Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
    println(makePhrase("Это невозможно выполнить"))
//    Если фраза начинается с "Я не уверен":
//    Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
    println(makePhrase("Я не уверен в успехе данной работы"))
//    Если фраза содержит слово "катастрофа":
//    Преобразование: Замените "катастрофа" на "интересное событие".
    println(makePhrase("Катастрофа если ты тупой"))
//    Если фраза заканчивается на "без проблем":
//    Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
    println(makePhrase("Работа в удовольствие без проблем"))
//    Если фраза содержит только одно слово:
//    Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
    println(makePhrase("Пиздец"))
    println(getLog("Пользователь вошел в систему -> 2021-12-01 09:48:23"))
    //    Задание 2: Маскирование Личных Данных
//    Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних
    //    четырех, символами "*".
    val numb = "4539 1488 0343 6467"
    val subString = numb.substring(15)
    println(subString)
    println(adress("username@example.com"))
    println(fileName("C:/Пользователи/Документы/report.txt"))

}
fun makePhrase(phase: String): String {
    var newPhase = phase
    if (phase.contains("невозможно")) {
        newPhase = phase.replace("невозможно", "совершенно точно возможно, просто требует времени",
            true)
        }
    if (phase.startsWith("Я не уверен")) {
        newPhase +=", но моя интуиция говорит об обратном"
    }
    if (phase.contains("Катастрофа")) {
        newPhase.replace("катастрофа", "интересное событие", true)
    }
    if (phase.endsWith("без проблем")) {
        newPhase = phase.replace("без проблем", "с парой интересных вызовов на пути",
            true)
    }
    if (phase.split(" ").size == 1) {
        newPhase = "Иногда, $phase, но не всегда"
    }
    return newPhase
}
//    Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//    Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23". Извлеките отдельно
    //    дату и время из этой строки и сразу распечатай их по очереди.
fun getLog(log:String) {
    // Находим индекс стрелки
    val index = log.indexOf(">")
    // Извлекаем подстроку, начиная с символа после стрелки
    val dateTime = log.substring(index + 2)
    //Разделяем дату и время
    val (date, time) = dateTime.split(" ")
    println("Дата $date")
    println("Время $time")
}
    //    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//    Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example
    //    [dot] com".
fun adress(string: String): String {
        val formated = string.replace("@", " [at] ").replace(".", " [dot] ")
        return formated
    }

//    Задание 4: Извлечение Имени Файла из Пути
//    Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
fun fileName(filePath: String):String {
    val fileName1 = filePath.substring(26)
    return fileName1
}
