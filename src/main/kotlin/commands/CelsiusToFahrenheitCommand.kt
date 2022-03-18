package commands

import Command

class CelsiusToFahrenheitCommand : Command {
    override val keyword: String = "celsius"
    override val description: String = "celsius to fahrenheit"

    override fun execute(text: String) {
        val celsius: Double
        try {
            celsius = text.toDouble()
        } catch (e: NumberFormatException) {
            println("An invalid value was entered")
            return
        }
        val fahrenheit: Double = celsius * 1.8 + 32
        println("${String.format("%.2f", celsius)}°C = ${String.format("%.2f", fahrenheit)}℉")
    }
}
