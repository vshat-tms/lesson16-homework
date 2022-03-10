package commands

import Command

class HelloFromSiarhey : Command {
    override val keyword = "Siarhey"
    override val description = "say hello from Siarhey"

    override fun execute(text: String) {
        println("Hello from Siarhey")
    }
}