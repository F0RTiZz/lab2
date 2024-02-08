fun main() {
    println("Введите количество секунд:")
    val seconds = readLine()?.toInt() ?: 0
    val text = agoToText(seconds)
    println(text)
}

fun agoToText(seconds: Int): String {
    return when {
        seconds in 0..60 -> "был(а) только что"
        seconds in 61..60 * 60 -> "${minutesAgo(seconds / 60)} назад"
        seconds in 60 * 60 + 1..24 * 60 * 60 -> "${hoursAgo(seconds / (60 * 60))} назад"
        seconds in 24 * 60 * 60 + 1..48 * 60 * 60 -> "вчера"
        seconds in 48 * 60 * 60 + 1..72 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
}

fun minutesAgo(minutes: Int): String {
    return when {
        minutes % 10 == 1 && minutes != 11 -> "$minutes минуту"
        minutes % 10 in 2..4 && (minutes < 10 || minutes > 20) -> "$minutes минуты"
        else -> "$minutes минут"
    }
}

fun hoursAgo(hours: Int): String {
    return when {
        hours % 10 == 1 && hours != 11 -> "$hours час"
        hours % 10 in 2..4 && (hours < 10 || hours > 20) -> "$hours часа"
        else -> "$hours часов"
    }
}