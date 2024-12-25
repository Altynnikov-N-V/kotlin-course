package com.Nikita.lessons_24

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
import java.lang.NullPointerException

fun main() {
    //Throwable
    //Error
    //OutOfMemoryError
    //Exception
    //IOException
    //FileNotFoundException
    //RuntimeException
    //NullPointerException
//    throw Exception("Сообщение об ошибке")
//    val exception = Exception("Сообщение об ошибке")
//    throw exception

    try {
        val r = null
//        r!!
//        val a = listOf(1)
//        a[2] //Индекс которого быть не может
        // Код, который может выбросить исключение
    } catch (e: NullPointerException) {
        println("NullPointerException")
        // Обработка конкретного типа исключения
    } catch (e: RuntimeException) {
        println("RuntimeException")
        // Обработка всех остальных исключений
    } finally {
        println("finally block")
        // Блок, который выполняется всегда, независимо от наличия исключения
    }
//    try {
//        // Код, который может выбросить исключения
//    } catch (e: Exception) {
//        when(e) {
//            is ExceptionA, is ExceptionB -> {
//                // Обработка исключений ExceptionA или ExceptionB
//                println("Обработано исключение типа A или B")
//            }
//            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
//        }
//    }
    try {
        val i = "string" as Double
    } catch (e: Throwable) {
        println("ClassCastException")

    }

    val r = "123123.0".toDouble()
    println(r)

    setAge(2)


//    val file = File("adadasdasdas")
////    println(file.readText()) //FileNotFoundException
//    file.createNewFile()
//    val q = file.inputStream()
//    q.close()
//    q.read()//IOException

//    val list = mutableListOf("")
//    try {
//        while (true) {
//            list.add("данныефвфывфвфвфывфывфывфывфывфывфыв")
//        }//OutOfMemoryError
//    } catch (e: Throwable) {
//        println("память кончилась")
//    }
    try {
        stack()
    }
    catch (e: Throwable) {
        println("StackOverFloww")
    } //StackOverFloww


}

class OrderException(message: String): RuntimeException(message){

}
fun setAge(age: Int) {
    check(age >= 0) {
        "negative"
    }//IllegalStateException
}

fun stack() {
    stack()
    //StackOverflowError
}