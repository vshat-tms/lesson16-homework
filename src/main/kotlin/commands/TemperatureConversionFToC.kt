package commands

import Command
import java.text.DecimalFormat
import java.util.*

class TemperatureConversionFToC : Command {
    override val keyword: String = "f_to_c"
    override val description: String = "Temperature conversion from fahrenheit to celsius"

    override fun execute(text: String) {
        println("Enter temperature in fahrenheit:")
        val scanner = Scanner(System.`in`)
        try {
            var numOfUser= scanner.nextDouble()
            var temperaturaInCelcius = (numOfUser - 32.0) * 5 / 9
            println("${DecimalFormat(TemperatureConversionCToF.DECIMAL_FORMAT).format(numOfUser)} ℉ = " +
                    "${DecimalFormat(TemperatureConversionCToF.DECIMAL_FORMAT).format(temperaturaInCelcius)} ℃")
        } catch (e: InputMismatchException){
            println("Uncorrect enter!")
        }
    }
    companion object {
        const val DECIMAL_FORMAT = "#0.00"
    }
}