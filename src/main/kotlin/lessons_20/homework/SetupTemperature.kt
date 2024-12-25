package com.Nikita.lessons_20.homework

abstract class SetupTemperature: TemperatureRegulatable, ProgrammingDevice(), Openable {
    override val maxTemperature: Int
        get() = 100
    override fun setTemperature(temp: Int) {
        println("Температура установлена $temp")
    }

    override fun open() {
        println("Открыто")
    }

    override fun close() {
        println("Закрыто")
    }
}