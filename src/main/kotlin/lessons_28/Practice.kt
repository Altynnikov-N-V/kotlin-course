package com.Nikita.lessons_28

import java.io.File

fun main() {
    val mapOne = mapOf("string" to 0.3, "string1" to 2.5, "string2" to 3.8)
    writeDataToFile(mapOne, "path/folfer/Practice_28/File.txt")

    println(readFileToMap("path/folfer/Practice_28/File.txt"))
}

fun createFileOrDirectory(path: String) {
    File(path).apply {
        if (path.endsWith("/")) {
            mkdirs()
        } else {
            parentFile.mkdirs()
            createNewFile()
        }
    }
}
//Создайте функцию, которая принимает словарь из строк и даблов, словарь превратить в 1 строку, где ключи и значения
// разделяются знаком равно и символом переноса строки, преобразовать данные в текстовый файл

fun writeDataToFile(map: Map<String, Double>, path1: String) {
    val dataToString = map.map { "${it.key}=${it.value}" }.joinToString("\n")
    createFileOrDirectory(path1)
    File(path1).writeText(dataToString)
}

//Прочитать файл, преобразовать строки в словарь ключ-значение
fun readFileToMap(path2: String): Map<String, Double> {
    val file02 = File(path2).readLines()
    return file02.associate {
        val string1 = it.split("=")
        string1[0] to string1[1].toDouble()
        }
}
