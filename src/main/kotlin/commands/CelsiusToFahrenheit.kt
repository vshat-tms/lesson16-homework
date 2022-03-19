package commands

import Command

class CelsiusToFahrenheitCommand : Command {
    override val keyword: String = "c_to_f"
    override val description: String = "Converts the temperature celsius to fahrenheit"

    override fun execute(text: String) {
        try {
            val valueCelsius = text.toDouble()
            val valueFahrenheit = valueCelsius * 1.8 + 32
            println("${String.format("%.2f", valueCelsius)} °C = ${String.format("%.2f", valueFahrenheit)} °F")
        } catch (e: NumberFormatException) {
            println("Введите корректное значение.")
        }
    }
}
