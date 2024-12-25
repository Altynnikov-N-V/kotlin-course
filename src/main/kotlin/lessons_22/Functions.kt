package com.Nikita.lessons_22

import com.Nikita.lessons_22.extensions.removeSpaces

fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)

    val s: List<Int?> = listOf(1, null)
    s.isElementsNullOrEmpty()

    println("asdasd".funA("asd", 12))
    listOf(1, 2, 3).funB(null)
    val num: Map<String, Int> = mapOf("asdasd" to 1, "asdasd1" to 2)
    num.funC<String, Any>("qweq", true)
    var num2: Double? = null
    println(num2.funD(0.2, "sadas"))
    num2.funD(0.3, "asdasd")
    println(setOf("asdasd", "asdasd123").funE("asdasd"))

    var num1: Double = 58.12345
    println("%,.2f".format(num1))
    println(num1.format())

    var str = "aaaa bbbb ccccc dddd"
    println(str.split(" ").size)
    println(str.wordCounter())

    var num3 = "aaa"
    val list1 = listOf(num3)
    val list3 = listOf(num3, num3, num3)
    println(num3.createList(8))


}

//В языках без расширения класса
//fun removeSpaces(str: String): String {
//    return str.replace(" ","")
//}

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}

fun String.funA(arg1: String, arg2: Int): Boolean {
    return true
}

fun List<Int>.funB(arg1: String?) {

}

fun <KEY, VAL> Map<KEY, VAL>.funC(arg1: KEY, arg2: VAL): Boolean {
    return true
}

fun Double?.funD(arg1: Double, arg2: String?): Double {
    return 0.0
}

fun <T> Set<T>.funE(arg1: T): List<T> {
    return listOf()
}

fun Double.format(): String {
    return "%,.2f".format(this)
}
fun String.wordCounter(): Int {
    return split(" ").size
}

fun <T> T.createList(n:Int): List<T> {
    return (0 until n).map { this }
}