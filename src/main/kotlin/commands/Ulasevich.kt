package commands

import Command

class Ulasevich : Command {
    override val keyword = "Ulasevich"
    override val description = "say hello from Vadim"

    override fun execute(text: String) {
        println("Hello from Vadim")
    }
}