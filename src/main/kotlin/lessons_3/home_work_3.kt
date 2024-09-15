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
//Список доступного оборудования
var availableEquipment: String = ""
//Список свободного оборудования
var freeEquipment: String = ""
//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var mealSchedule: String
//План мероприятий на случай сбоев
var emergency: String = ""
//Список экспертов и жюри
var juriList: String = ""
// Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
val lazyMethod: String by lazy { "" }
//Политика конфиденциальности
val privacyPolicy: String = ""
//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
val lazyFeedback: String = ""
//Текущая температура в помещении
var celcii: Double = 22.5
//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var status_: String = ""
//Уровень освещения
var lightingLevel: Int = 5
//Лог событий мероприятия
private var logs: String = ""
//Доступность медицинской помощи
var emergency_: Boolean = true
//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
private val plan: String = ""
//Регистрационный номер мероприятия
const val Int = 111
//Максимально допустимый уровень шума в помещении хакатона.
val level: Int = 60
//Индикатор превышения уровня шума в помещениях
var maxLevel: Boolean = false
//Формат мероприятия (зависит от геополитической обстановки)
var format: String = ""
//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было
// меньше нуля.
var countSeat: Int = 1
    get() = field
    set (value1) {
        if (value1 >= 1) field = value1
    }
//План взаимодействия с прессой
val planPressa: String = ""
//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона
// автоматизированных проверок.
private val informationComamd: String = ""
//Статус получения всех необходимых разрешений
private val statusComand: String = ""
//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
private val dostup: Boolean = true
//Список партнеров мероприятия
var partners: String = ""
//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
val lazyMedia: String by lazy { "" }
//План распределения призов
lateinit var prizy: String
//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private val information: String = ""
//Особые условия для участников с ограниченными возможностями
val invalid: String = ""
//Общее настроение участников (определяется опросами)
val lazyOtzyv: String by lazy { "" }
//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед
// началом мероприятия.
lateinit var planHakaton: String
//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
lateinit var celebrity: String
//Максимальное количество людей, которое может вместить место проведения.
val maxPeople: Int = 5000
//Стандартное количество часов, отведенное каждой команде для работы над проектом.
val timeKomand: Int = 100