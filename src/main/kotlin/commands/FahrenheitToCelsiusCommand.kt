package commands

import Command

class FahrenheitToCelsiusCommand: Command {
    override val keyword: String = "fahrenheit"
    override val description: String = "fahrenheit to celsius"

    override fun execute(text: String) {
        val fahrenheit: Double
        try {
            fahrenheit = text.toDouble()
        } catch (e: NumberFormatException){
            println("An invalid value was entered")
            return
        }
        val celsius: Double = (fahrenheit - 32) / 1.8
        println("${String.format("%.2f", fahrenheit)}℉ = ${String.format("%.2f", celsius)}°C")

    }
}