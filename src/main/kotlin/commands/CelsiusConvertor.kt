package commands

import Command

/**
 * Делает то же, что и f_to_c, только наоборот
 */

class CelsiusConvertor : Command {
    override val keyword = "c_to_f"
    override val description = "Conversion from Celsius to Fahrenheit"

    override fun execute(text: String) {
        val celsius = text.toDoubleOrNull()
        if (celsius == null) {
            println("Некорректный ввод")
            return
        }
        val fahrenheit = celsius * 1.8 + 32
        println("${String.format("%.2f", celsius)} ℃ = ${String.format("%.2f", fahrenheit)} ℉")
    }
}