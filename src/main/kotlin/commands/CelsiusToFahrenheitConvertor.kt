package commands

import Command
import java.text.DecimalFormat
import java.util.*

class CelsiusToFahrenheitConvertor : Command {
    override val keyword = "celsiusToFahrenheit"
    override val description = "converts celsius to fahrenheit"

    override fun execute(text: String) {
        println("Enter celsius")
        val scanner = Scanner(System.`in`)
        val input = scanner.nextLine()
        celsiusToFahrenheit(input)
    }
}

fun celsiusToFahrenheit(input: String) {
    try {
        val celsius = input.toDouble()
        val fahrenheits = (celsius * 9 / 5) + 32
        println(DecimalFormat("#0.00").format(fahrenheits))
    } catch (e: NumberFormatException) {
        println("$input is not correct")
    }
}