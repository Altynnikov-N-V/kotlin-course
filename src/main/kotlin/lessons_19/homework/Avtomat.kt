package com.Nikita.lessons_19.homework

class Avtomat {
//    Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов
//    (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)
//
//    Поля:
//    цвет
    var color = ""
//    модель
    val model = ""
//    включен
    private var isOn = true
//    ОС загружена
    private var statusOn = true
//    список доступных игр
    val listGame = listOf<String>()
//    наличие джойстика
    val gamePad = true
//    баланс вырученных средств
    private var balance = 0
//    владелец
    private var owner = ""
//    телефон поддержки
    var numbert = ""
    private var winCash = 1
//
//    Методы:
//    включить
    fun ternOn(){
        isOn = true
        loadingOS()
    }
//    выключить
    fun ternOff(){
        isOn = false
        turnOff()
    }
//    загрузить ОС
    private fun loadingOS() {
        statusOn = true
    }
//    завершить работу ОС
    private fun turnOff(){
        statusOn = false
    }
//    показать список игр
    fun showGame(): List<String>{
        return this.listGame
    }
//    включить игру
    fun turnOnGame(listGame: List<String>){
        showGame()[1]
    }
//    оплатить игровой сеанс
    fun payGame() {
        balance++
    }
//    открыть сейф и выдать наличные
    private fun openSafeGetCash(){}
//    выплатить выигрыш
    private fun cash(){
        balance-winCash
    }

}