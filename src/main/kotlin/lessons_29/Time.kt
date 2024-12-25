package com.Nikita.lessons_29

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.*
import java.time.temporal.ChronoUnit

fun main(){
//Класс хранит разницу в секундах
    val instant = Instant.now()
//    println(instant.toEpochMilli())

//Работает с датами, не учитывает временную зону
    val dateTimeNow = LocalDate.now()
    val birthday = LocalDate.of(1983, 10, 2)

//    println(dateTimeNow)
//    println(birthday)

//Время без учета дат
    val localTimeNow = LocalTime.now()
    val endOfTheMyWorkingDay = LocalTime.of(18, 0, 0)

//    println(localTimeNow)
//    println(endOfTheMyWorkingDay)

//Комбинированный содержит дату и время
    val localDateTime = LocalDateTime.now()
    val alarmClock = LocalDateTime.of(2024, 4, 1, 9, 0, 0)
//    println(localDateTime)
//    println(alarmClock)

//Дата, время + часовой пояс
    val vaticanCurrentTime = ZonedDateTime.now(ZoneId.of("Europe/Vatican"))
    val mobileWorldCongress = ZonedDateTime.of(2024, 2, 26, 10, 0, 0,
        0, ZoneId.of("Europe/Madrid"))
//    println(vaticanCurrentTime)
//    println(mobileWorldCongress)


//Учитывает смещение времени
    val birthdayInstant = birthday.atTime(19, 0).toInstant(ZoneOffset.of("+09:00"))
//Преобразование 1 тип в другой
    val vaticanCurrentTimeInstant = vaticanCurrentTime.toInstant()

//    println(vaticanCurrentTimeInstant)
//    println(birthdayInstant)
//Возвращение тайм зоны которая установлена на ПК
    val instantToZonedDateTime : ZonedDateTime= instant.atZone(ZoneId.systemDefault())
//Смещение времени
    val instantToOffsetDateTime = instant.atOffset(ZoneOffset.of("-02:00"))
//    println(instantToZonedDateTime)
//    println(instantToOffsetDateTime)

    //Текущая дата + 1 год
    LocalDate.now().plusYears(1)
    //Текущая дата + секунды
    LocalDateTime.now().plusSeconds(33)
    //Текущая дата - года
    LocalDate.now().minusYears(2)
//Период
    Period.between(birthday, LocalDate.now())
//Разница между двумя объектами, хранит в секундах
    Duration.between(alarmClock, LocalDateTime.now())

//Методы сравнения
    alarmClock.isAfter(localDateTime)
    alarmClock.isBefore(localDateTime)
    alarmClock.isEqual(localDateTime)

//размерность прибавления
    val nextAlarmClock = alarmClock.plus(5, ChronoUnit.MINUTES)
    val nextBirthday = birthday.plusYears(1)

//Периоды трансформации
    val nanoSeconds = Duration.ofNanos(200)
    println(nanoSeconds.dividedBy(4).toNanos())
    println(nanoSeconds.plus(Duration.ofSeconds(2)).toNanos())
    val seconds = Duration.ofSeconds(45)
    println(seconds.minusMinutes(1).seconds)
    val period = Period.of(2, 4, 10)
    println(period.minusMonths(13).toTotalMonths())
    val periodFromConferenceToBirthday = Period.between(mobileWorldCongress.toLocalDate(), birthday)
    println("${periodFromConferenceToBirthday.years} лет ${periodFromConferenceToBirthday.months} месяцев" +
            " ${periodFromConferenceToBirthday.days} дней")


//Форматирование дат
    val formatter = ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ")
    val formattedDate = vaticanCurrentTime.format(formatter)
    println("Текущая дата и время с миллисекундами и часовым поясом: $formattedDate")

//    val isoFormatter = DateTimeFormatter.ISO_DATE_TIME
//    val isoFormattedDate = birthdayInDubai.format(isoFormatter)
//    println(isoFormattedDate)
    val prettyFormatter = ofPattern("'год' yyyy', месяц' MM', день' dd")
    val prettyFormattedDate = dateTimeNow.format(prettyFormatter)
    println(prettyFormattedDate)

//    try {
//        println("При форматировании с часовым поясом помни, что в LocalDateTime его нет и будет ошибка
//        ${localDateTime.format(formatter)}")
//    } catch (e: Throwable) {
//        e.printStackTrace()
//    }
//
//    try {
//        println("При форматировании LocalDate помни, что нет полей времени и будет ошибка ${birthday.format
//        (formatter)}")
//    } catch (e: Throwable) {
//        e.printStackTrace()
//    }
    //Парсинг
    val parsedDate = LocalDate.parse(prettyFormattedDate, prettyFormatter)
    println(parsedDate)
}