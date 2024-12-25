package com.Nikita.lessons_27

fun main() {

//    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7)
//    list.add(8)
//    println(list)

//    val list1 = list.toList()

    val list2 = with(mutableListOf(1, 2, 3, 4)) {
        add(6)
        println(this)
        toList()
    }.size

//    val sb = StringBuilder()
//    sb.append("Asdasdasd")
//    sb.append("asdadsasdads")
//    sb.append("qweqweqweqwe")
//
//    val strLength = sb.length
    val sb = StringBuilder().run {
        append("vsfsdfsxvxv", "czxczczczx")
        append("asdadsasdads")
        append("qweqweqweqwe")
        length
    }

//    val list = arrayListOf<String>()
//    list.add("asdads")
//    list.add("zxczczc")

    val list3 = arrayListOf<String>().apply {
        add("asdasdasd")
        add("zcxzczxc")
        add("cvbcbcbvc")
    }
    val list4 = arrayListOf<String>().also {
        it.add("asdasdasd")
        it.add("zcxzczxc")
        it.add("cvbcbcbvc")
    }
    val string: String? = "ghjghgh"
    string?.length

    println(string?.length)
    println(string?.isEmpty())
    println(string?.uppercase())

    string?.let {
        println(it.length)
        println(it.isEmpty())
        println(it.uppercase())
    }

}