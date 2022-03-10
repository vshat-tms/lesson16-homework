package commands

import Command
import java.text.SimpleDateFormat
import java.util.*

class ShowLocalDateTime : Command {
    override val keyword: String = "time"
    override val description: String = "shows local date and time"

    override fun execute(text: String) {
        val currentDate = SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        println("Дата: $currentDate")
    }
}