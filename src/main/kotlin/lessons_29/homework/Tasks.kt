package com.Nikita.lessons_29.homework

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {
//1. Создай текущую временную метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val nowTime = Instant.now()
    println(nowTime)

//2. Создай дату своего дня рождения.
    val myBirthday = LocalDate.of(1990, 10, 4)
    println(myBirthday)

//3. Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val currentDate = LocalDate.now()
    val nowPeriod = Period.between(currentDate, myBirthday)
    println(nowPeriod)

//5. Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
//Не используй в них метод now()
    task4(myBirthday)
    task4ByIso(myBirthday)
    task4(LocalDate.of(1990, 10, 4))
    task4ByIso(LocalDate.of(1990,10,4,))
    task4(ZonedDateTime.of(
        1990,
        10,
        4,
        0,
        23,
        25,
        336,
        ZoneId.of("Europe/Moscow")))
    task4ByIso(ZonedDateTime.of(
        1990,
        10,
        0,
        14,
        10,
        10,
        11,
        ZoneId.of("Europe/Moscow")))
}
//4. Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
//содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
//В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном
//объекте. Обработай в методе все типы дат, которые знаешь. Реализуй два варианта функции - с собственным
//форматированием и с форматами из ISO коллекции.
fun task4(temporal: Temporal): String {
    return when (temporal) {
        is LocalDate -> temporal.toString()
        is LocalDateTime ->
            temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        is ZonedDateTime ->
            temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        is OffsetDateTime ->
            temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        else -> "Неверный формат"
    }
}

fun task4ByIso(temporal: Temporal): String{
    return when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        else -> "Неверный формат"
    }
}
//6. Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
//пределяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год
//включительно, и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в
//один из этих диапазонов, функция должна возвращать "Не определено". Для сравнения дат используй методы
//isAfter(otherDate) и isBefore(otherDate). Объекты с эталонными датами вынеси в приватные поля файла с методом
//identifyGeneration.

//7. Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует
//дату в месяц и день.
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней.
//Найди отличия)))
