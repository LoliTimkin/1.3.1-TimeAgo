fun main() {

    agoToText(1261) // 21 минуту назад
    agoToText(7200) // 2 часа назад
    agoToText(39620) // 11 часов 20 минут (11 часов)
    agoToText (52) // только что
    agoToText(86401) // сегодня
    agoToText(172801) // вчера

}

fun agoToText(timeAgo: Int) {
    return when (timeAgo) {
        in 0..60 -> println("был(а) в сети только что")
        in 61..3600 -> convertMinuteToText(timeAgo)
        in 3601..3600*24 -> convertHourToText(timeAgo)
        in 86401..3600*24*2 -> println("был(а) в сети сегодня")
        in 172801..3600*24*3 -> println("был(а) в сети вчера")
        else -> println("был(а) в сети давно")
    }
}

fun convertMinuteToText (timeAgo: Int) {
    val minutes: Int = timeAgo / 60
    if (minutes in 11..20) {
        println("был(а) в сети $minutes минут назад")
    } else if (minutes % 10 == 1) {
        println("был(а) в сети $minutes минуту назад")
    } else if (minutes % 10 in 2..4) {
        println("был(а) в сети $minutes минуты назад")
    } else println("был(а) в сети $minutes минут назад")
}

fun convertHourToText (timeAgo: Int) {
    val hours: Int = timeAgo / 3600
    if (hours in 11..20) {
        println("был(а) в сети $hours часов назад")
    } else if (hours % 10 == 1) {
        println("был(а) в сети $hours час назад")
    } else if (hours % 10 in 2..4) {
        println("был(а) в сети $hours часа назад")
    } else println("был(а) в сети $hours часов назад")
}
