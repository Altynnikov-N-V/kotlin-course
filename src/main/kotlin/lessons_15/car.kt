package com.Nikita.lessons_15

class Car(val brand: String,
          val model: String) {
    companion object{
        val brands= listOf("VAZ", "GAZ", "UAZ")
    }


    fun sayMyName(){
        println("My brend $brand $model")
    }
}