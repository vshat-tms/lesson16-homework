package Ermoshin_Stepan

import Command

class CelsiusToFahrenheits : Command{
    override val keyword: String = "c_to_f"
    override val description: String = "translates celsius to fahrenheits"

    override fun execute(text: String) {

        try {
            val celsius = text.toDouble()
            val fahrenheits = 1.8 * celsius + 32
            println("${String.format("%.2f", celsius)} °C = ${String.format("%.2f", fahrenheits)} °F")
        } catch (ex: NumberFormatException) {
            println("$text isn't a number")
        }
    }
}