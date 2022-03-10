package commands

import Command

class HelloGrebnevCommand : Command {
    override val keyword = "grebnev"
    override val description = "Hi! From Petr Grebnev"

    override fun execute(text: String) {
        println("Hi! from Petr")
    }
}