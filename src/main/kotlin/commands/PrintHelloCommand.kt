package commands

import Command

// hello Ivan -> Hello, Ivan!
class PrintHelloCommand : Command {
    override val keyword = "hello"
    override val description = "prints hello"

    override fun execute(text: String) {
        println("Hello, $text!")
    }
}