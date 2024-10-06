package com.Nikita.lessons_6

fun main () {
    val month = 3
    println("Сезон для месяца $month: ${determiningSeason(month)}")

    val dogAge = 2
    val humanAge = petAge(dogAge)
    println("Возраст собаки $dogAge соответствует возрасту $humanAge человека")

    val route = 1
    val checkTransport = transport(route)
    println("Если маршрут составляет $route то выбирай $checkTransport")

    val sumBuy = 1529
    val bonusCount = bonusPoints(sumBuy)
    println("При покупке на сумму $sumBuy вы получите $bonusCount бонусов")

    val type = ".jpeg"
    println("При расширении $type тип документа будет ${typeDocument(type)}")

    val tempInC = 25.0
    val tempInF = 77.0
    println(convertTemperature(tempInC, "C"))
    println(convertTemperature(tempInF, "F"))
}
//В каждом задании также нужно валидировать входящие данные, если это имеет смысл.
//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
fun determiningSeason(month: Int): String {
    return when (month) {
        1, 2, 12 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9,10, 12 -> "Осень"
        else -> "Некорректное значение месяца"
    }
}
//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки
// равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
fun petAge(dogAge: Int): Double {
    return when {
        dogAge < 0 -> throw IllegalArgumentException ("Неверное значение возраста")
        dogAge <= 2 -> dogAge * 10.5
        else -> (21 + (dogAge - 2) * 4).toDouble()
    }
}
//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
fun transport(route: Int): String {
   return when {
       route <= 0 -> "Некорректное значение"
       route <= 1 -> "Пешком"
       route <= 5 -> "Велоспиед"
       else -> "Автотранспорт"
    }
}
//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму
// покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5
// баллов за каждые 100 рублей при сумме свыше этого.
fun bonusPoints(sumBuy: Int): Int{
    return if (sumBuy <= 1000) {
        (sumBuy / 100) * 2
    } else {
        (sumBuy / 100) * 5
    }
}
//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения
// файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
fun typeDocument(type: String): String{
    return when (type) {
    in ".txt" -> "Текстовый документ"
    in ".jpeg" -> "Изображение"
    in ".xml" -> "Таблица"
    else -> "Неизвестный тип"
    }
}
//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости
// от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции. Несколько
// аргументов передаются через запятую. Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result
// C” для цельсия
fun convertTemperature(temperature: Double, unit: String): String {
    return when (unit.uppercase()) {
        "C" -> {
            val fahrenheit = temperature * 9 / 5 + 32
            "$fahrenheit F"
        }
        "F" -> {
            val celsius = (temperature - 32) * 5 / 9
            "$celsius C"
        } else -> "Некорректная единица измерения. Используйте 'C' или 'F'."
    }
}