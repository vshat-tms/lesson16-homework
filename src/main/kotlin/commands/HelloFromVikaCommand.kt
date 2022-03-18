package commands

import Command

class HelloFromVikaCommand: Command {
    override val keyword = "vika"
    override val description = "say hello from vika"

    override fun execute(text: String) {
        println("Hey from vika")
    }
}