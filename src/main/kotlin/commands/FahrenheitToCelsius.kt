package commands

import Command

class FahrenheitToCelsiusCommand : Command {
    override val keyword: String = "f_to_c"
    override val description: String = "Converts the temperature fahrenheit to celsius"

    override fun execute(text: String) {
        try {
            val valueFahrenheit = text.toDouble()
            val valueCelsius = (valueFahrenheit - 32) / 1.8
            println("${String.format("%.2f", valueFahrenheit)} °F = ${String.format("%.2f", valueCelsius)} °C")
        } catch (e: NumberFormatException) {
            println("Введите корректное значение.")
        }
    }
}