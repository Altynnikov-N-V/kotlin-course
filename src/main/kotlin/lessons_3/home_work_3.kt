package com.Nikita.lessons_3

class home_work_3 {
}
//Погрузимся в атмосферу "Hackathon Survival": Марафон, где участники пытаются завершить реальный проект в условиях
// искусственно созданного хаоса (например, часто меняющиеся требования, неожиданные "сбои" в оборудовании)
//Для каждого из полей подбери наилучший способ хранения из известных тебе. Учитывай такие факторы, как изменяемость,
// обязательность, возможность начальной установки, ресурсоёмкие вычисления значения, необходимость проверки
// устанавливаемого значения на валидность или запрет доступа на установку при возможности чтения, публичность и
// приватность данных.

//Название мероприятия
val namee: String = "Hackathon Survival1"

//Дата проведения
var date: String = ""
//Место проведения
val location: String = ""
//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
private var budget: String = ""
//Количество участников
var member: Int = 0
    get() = field
    private set(value) { field = value}
//Длительность хакатона
var duration: Long = 10
//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private lateinit var contactinformation: String
//Текущее состояние хакатона (статус)
var status: String = ""
//Список спонсоров
val list: String = ""
//Текущий уровень доступа к интернету
var internet: Int = 0
//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var transportInformation: String = ""
//Количество команд
var countKomand: Int = 1
//Перечень задач
val work: String = ""
//План эвакуации
val evacuationPlan: String = ""
