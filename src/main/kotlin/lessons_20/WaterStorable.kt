package com.Nikita.lessons_20

interface WaterStorable {
    val volume: Double
    fun fill(amount: Double)
    fun take(amount: Double)
}