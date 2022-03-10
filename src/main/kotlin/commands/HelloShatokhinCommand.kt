package commands

import Command

class HelloShatokhinCommand : Command {
    override val keyword = "shatokhin"
    override val description = "say hello from shatokhin"

    override fun execute(text: String) {
        println("Hello from Shatokhin")
    }
}