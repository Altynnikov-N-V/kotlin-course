package com.Nikita.lessons_26

fun main() {
    val name: (Int) -> String = {
        it.toString() + "3"
    }
    qwerty1(name)

    val name2: (Int) -> String = {
        "${it + 5}"
    }
    qwerty1(name2)
}

fun qwerty1(arg1: () -> Unit) {

}

fun qwerty2() {
    val q = fun() {}
    val q2: () -> Unit
}

fun qwerty1(arg2: (Int) -> String) {
    println(arg2(51))

}


fun <T> q3(arg4: List<T>, arg3: (List<T>) -> T): T {
    return arg3(arg4)
}
