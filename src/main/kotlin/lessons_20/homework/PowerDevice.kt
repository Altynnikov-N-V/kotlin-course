package com.Nikita.lessons_20.homework

abstract class PowerDevice: Powerable {
    override fun powerOn() {
        println("Устройство включено")
    }

    override fun powerOff() {
        println("Устройство выключено")
    }
}