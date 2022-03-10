package commands

import Command

class HelloPyshnikCommand : Command {
    override val keyword = "Pyshnik"
    override val description = "say hello from Pyshnik"

    override fun execute(text: String) {
        println("Hello from Pyshnik")
    }
}