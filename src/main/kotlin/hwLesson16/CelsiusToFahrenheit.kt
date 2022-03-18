package hwLesson16

import java.text.DecimalFormat

fun celsiusToFahrenheit(input: String) {
    try {
        val celsius = input.toDouble()
        val fahrenheits = (celsius * 9 / 5) + 32
        println(DecimalFormat("#0.00").format(fahrenheits))
    } catch (e: NumberFormatException) {
        println("$input is not correct")
    }
}