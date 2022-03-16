package commands

import Command

class C_To_F: Command {
    override val keyword: String = "celsius"
    override val description: String = "celsius to fahrenheit"

    override fun execute(text: String) {
        try {
            val celsius: Double = text.toDouble()
            val fahrenheit: Double = celsius * 1.8 + 32
            println("${String.format("%.2f", celsius)}°C = ${String.format("%.2f", fahrenheit)}℉")
        } catch (e: NumberFormatException) {
            println("An invalid value was entered")
        }

    }
}
