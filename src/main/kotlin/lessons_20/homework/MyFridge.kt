package com.Nikita.lessons_20.homework

class MyFridge(): Powerable,Openable, ProgrammingDevice(), TemperatureRegulatable {
    override fun open() {
        println("Открыт")
    }

    override fun close() {
        println("Закрыт")
    }

    override val maxTemperature: Int
        get() = 10

    override fun setTemperature(temp: Int) {
        val temp = 5
        println("Температура установлена $temp")
    }

}