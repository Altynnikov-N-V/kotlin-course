package com.Nikita.lessons_28

import java.io.File

fun main() {
    //Файл
    val file = File("path/to/your/file.txt")
    //Директория
    val directory = File("path/to/your")
//Создание файла
    file.parentFile.mkdirs()
//Создание файла + проверка создания файла
    val isNewFileCreated: Boolean = file.createNewFile()
    if (isNewFileCreated) {
        println("Файл был создан")
    } else {
        println("Файл уже существует")
    }

//Проверка наличия файла
    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }

//Запись текста в файл, при повторном вызове перезаписывает
    file.writeText("Hello, world!")

//Чтение файла
    val text = file.readText()
    println(text)
//Создание подпапок
    (1..5).forEach {
        file.parentFile.resolve("$it").mkdirs()
    }
//Получение списка того, что есть
    val files = directory.listFiles()
    files?.forEach { file ->
        println(file.name)
    }
//Проверка того, что записано по пути
    val files1 = directory.listFiles()
    files1?.forEach { file ->
        if (file.isFile)
            println(file)
    }
//Удаление файла
//    if (file.delete()) {
//        println("Файл удален")
//    } else {
//        println("Не удалось удалить файл")
//    }
//Удаление директории
//    if (file.parentFile.resolve("1").delete()) {
//        println("Файл удален")
//    } else {
//        println("Не удалось удалить файл")
//    }
////Удаление директории полностью
//    if (file.parentFile.deleteRecursively()) {
//        println("Директория и всё её содержимое удалено")
//    } else {
//        println("Не удалось удалить директорию")
//    }
//Превращение файловой системы в поток
//    file.walk().filter { it.isFile }
//        .associateWith { it.readLines() } //Превращение потока в словарь
//        .filterValues { data ->
//            data.any {it.contains("text")}
//        }
    println(file.absoluteFile) //Свойство, которое хранит абсолютный путь до файла

    val t: String = file.parent
    val k: File = file.parentFile

    println(file.parent) //Имя пути
    println(file.parentFile) //Объект файл, который хранит в себе путь

    val baseDir = File("/path/to")
    val file1 = File("/path/to/nested/file.txt")
    val relative = file1.toRelativeString(baseDir)
    println(file1.toRelativeString(baseDir))//Возвращение относительного пути, относительно базового, сохранение
    // структуры директории
    val baseDir2 = File("path2/to")
    val file3 = baseDir2.resolve(relative)
    file3.parentFile.mkdirs()
    file3.createNewFile()
}