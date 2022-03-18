package hwLesson16

import java.text.DecimalFormat

fun fahrenheitToCelsius(input: String) {
    try {
        val fahrenheits = input.toDouble()
        val celsius = (fahrenheits - 32) * 5 / 9
        println(DecimalFormat("#0.00").format(celsius))
    } catch (e: NumberFormatException) {
        println("$input is not correct")
    }
}
