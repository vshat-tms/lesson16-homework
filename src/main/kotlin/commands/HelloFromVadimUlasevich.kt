package commands

import Command

class HelloFromVadimUlasevich : Command {
    override val keyword = "Ulasevich"
    override val description = "Hello from Vadim"

    override fun execute(text: String) {
        println("Hello from Vadim!")
    }
}