package commands

import Command
import java.text.DecimalFormat

class TemperatureConversionFToC : Command {
    override val keyword: String = "f_to_c"
    override val description: String = "Temperature conversion from fahrenheit to celsius"

    override fun execute(text: String) {
        val numFromUser: Double
        try {
            numFromUser = text.toDouble()
        } catch (e: NumberFormatException) {
            println("Uncorrected enter!")
            return
        }
        val temperaturaInCelcius = (numFromUser - 32.0) / 1.8
        println(
            "${DecimalFormat(DECIMAL_FORMAT).format(numFromUser)} ℉ = " +
                    "${DecimalFormat(DECIMAL_FORMAT).format(temperaturaInCelcius)} ℃"
        )
    }

    companion object {
        const val DECIMAL_FORMAT = "#0.00"
    }
}