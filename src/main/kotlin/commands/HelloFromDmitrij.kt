package commands

import Command

class Dmitrij : Command {
    override val keyword = "Gotovko"
    override val description = "Hello! I'm Dima"

    override fun execute(text: String) {
        println("Hello from Dmitrij")
    }
}