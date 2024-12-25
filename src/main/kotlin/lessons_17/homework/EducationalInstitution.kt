package com.Nikita.lessons_17.homework

open class EducationalInstitution(val name: String, val level: String) {
}
open class Institute(
    name: String,
    level: String,
    val facultat: String
) : EducationalInstitution(name, level)

class Universitet(name :String,
                  level:String,
                  facultat:String
) : Institute(name, level,facultat)