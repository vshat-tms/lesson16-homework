package commands

import Command

class f_to_c_fromKirill: Command {
    override val keyword = "f_to_c"
    override val description = "convert fahrenheit to celsius"

    override fun execute(text: String) {
        try {
            val fah = text.toDouble()
            val cel = (fah - 32)/1.8
            println("${String.format("%.2f", fah)} °F = ${String.format("%.2f", cel)} °C")
        }catch (e: Exception){
            println("$text - not number")
        }
    }
}