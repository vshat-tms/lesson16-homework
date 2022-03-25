package commands

import Command

class CelsiusToFahrenheit : Command {
    override val keyword = "c_to_f"
    override val description = "translates celsius to fahrenheits"

    override fun execute(text: String) {

        try {
            val celsius = text.toDouble()
            val fahrenheit = celsius * 1.8 + 32
            println("${String.format("%.2f", celsius)}°C = ${String.format("%.2f", fahrenheit)}℉")
        } catch (e: NumberFormatException) {
            print("Enter a number, not a letter: ")
            return
        }
    }
}