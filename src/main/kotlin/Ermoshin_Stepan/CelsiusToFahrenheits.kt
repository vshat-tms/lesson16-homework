package Ermoshin_Stepan

import Command

class CelsiusToFahrenheits : Command{
    override val keyword: String = "c_to_f"
    override val description: String = "translates celsius to fahrenheits"

    override fun execute(text: String) {
        var celsius = 0.0
        try {
            celsius = text.toDouble()
        } catch (ex: NumberFormatException) {
            println("$text isn't a number")
        }

        val fahrenheits = 1.8 * celsius + 32
        println("${String.format("%.2f", celsius)} °C = ${String.format("%.2f", fahrenheits)} °F")
    }
}