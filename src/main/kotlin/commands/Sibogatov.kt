package commands

import Command

class Sibogatov: Command{
    override val keyword = "sibogatov"
    override val description = "print something"

    override fun execute(text: String) {
        println("Sibogatov Ilya")
    }
}