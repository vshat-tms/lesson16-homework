package commands

import Command
import java.text.DecimalFormat
import java.util.*

class TemperatureConversionCToF : Command {
    override val keyword: String = "c_to_f"
    override val description: String = "Temperature conversion from celsius to fahrenheit"

    override fun execute(text: String) {
        println("Enter temperature in celsius:")
        val scanner = Scanner(System.`in`)
        try {
            var numOfUser= scanner.nextDouble()
            var temperaturaInFahrenheit = (numOfUser * 9/5) + 32
            println("${DecimalFormat(DECIMAL_FORMAT).format(numOfUser)} ℃ = " +
                    "${DecimalFormat(DECIMAL_FORMAT).format(temperaturaInFahrenheit)} ℉ ")
        } catch (e: InputMismatchException){
            println("Uncorrect enter!")
        }
    }
    companion object {
        const val DECIMAL_FORMAT = "#0.00"
    }
}