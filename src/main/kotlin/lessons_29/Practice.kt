package com.Nikita.lessons_29

import java.time.Instant
import java.time.LocalDate
import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime

fun main(){
    val currentTime = Instant.now()

    val myTime = Instant.ofEpochSecond(12312311)
    println(myTime)

    val dayOne = LocalDate.of(2024,9,1)
    val dayTwo = LocalDate.of(2025,5,1)
    val differDays = Period.between(dayOne, dayTwo)
    println(differDays)

    val dayThree = Period.of(2,4,430)
    println(dayTwo.plus(dayThree))
    val calendar = ZonedDateTime.of(2024,12,16,10,0,0,0,
        ZoneId.of("Europe/Moscow"))
    println(calendar)
    println(dayThree.multipliedBy(2))
}