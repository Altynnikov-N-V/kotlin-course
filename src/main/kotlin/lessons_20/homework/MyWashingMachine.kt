package com.Nikita.lessons_20.homework

class MyWashingMachine: PowerDevice(), Openable, TemperatureRegulatable {
    override fun open() {
        println("Открыта дверь")
    }

    override fun close() {
        println("Дверь закрыта")
    }

    override val maxTemperature: Int
        get() = 90

    override fun setTemperature(temp: Int) {
        println("Температура установлена $temp")
    }
}