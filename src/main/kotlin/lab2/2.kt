val type_card = readln()
val sum_mounth = 2000
val sum = 75000
val suman = sum + sum_mounth
val procent = (suman - 75000)*(0.6/100)

fun main(args: Array<String>) {
    println(commission(type_card))
}
fun commission (type_card: String) = when {
    type_card == "Maestro" || type_card == "MasterCard" && suman < 75000 -> "Сумма: $sum"
    type_card == "Maestro" || type_card == "MasterCard" && suman > 75000 -> "Сумма: ${procent + sum + 20}"
    type_card == "VK Pay" -> "Сумма: $sum"
    else -> "-"
}