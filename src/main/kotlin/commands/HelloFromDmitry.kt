package commands

import Command

class Dmitry : Command {
    override val keyword = "Gotovko"
    override val description = "Greetings from dmitry"

    override fun execute(text: String) {
        println("Hello from Dmitry")
    }
}