package commands

import Command
import java.text.DecimalFormat
import java.util.*

class FahrenheitToCelsiusConvertor : Command {
    override val keyword = "fahrenheitToCelsius"
    override val description = "converts fahrenheit to celsius"

    override fun execute(text: String) {
        println("Enter fahrenheit")
        val scanner = Scanner(System.`in`)
        val input = scanner.nextLine()
        fahrenheitToCelsius(input)
    }
}

fun fahrenheitToCelsius(input: String) {
    try {
        val fahrenheits = input.toDouble()
        val celsius = (fahrenheits - 32) * 5 / 9
        println(DecimalFormat("#0.00").format(celsius))
    } catch (e: NumberFormatException) {
        println("$input is not correct")
    }
}