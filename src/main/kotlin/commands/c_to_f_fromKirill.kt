package commands

import Command

class c_to_f_fromKirill: Command {

    override val keyword = "c_to_f"
    override val description = "convert celsius to fahrenheit"

    override fun execute(text: String) {
        try {
            val cel = text.toDouble()
            val fah = cel * 1.8 + 32
            println("${String.format("%.2f", cel)} °C = ${String.format("%.2f", fah)} °F")
        }catch (e: Exception){
            println("$text - not number")
        }
    }
}