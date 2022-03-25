package commands

import Command

class HelloFromKirillCommand: Command {

    override val keyword = "kirill"
    override val description = "Say hello from Kirill"

    override fun execute(text: String) {
        println("Hello from Kirill")
    }
}