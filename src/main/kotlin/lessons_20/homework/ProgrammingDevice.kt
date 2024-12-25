package com.Nikita.lessons_20.homework

abstract class ProgrammingDevice : Programmable, PowerDevice() {
    override fun programAction(action: String) {
        println("Устройство запрограмированно под $action")
    }

    override fun execute() {
        println("Выполняется программа")
    }

}