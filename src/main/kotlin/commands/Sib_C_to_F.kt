package commands

import Command

/**
 * Делает то же, что и f_to_c, только наоборот
 */

class Sib_C_to_F: Command {
    override val keyword = "sib_CF"
    override val description = "C to F method"

    override fun execute(text: String) {
        try {
            val celIn = text.toDouble()
            val farOut = celIn * 1.8 + 32
            println("${String.format("%.2f", celIn)} Градусов Цельсия = ${String.format("%.2f", farOut)} Фаренгейт")
        } catch (ex: Exception) {
            println("Некорректный ввод")
        }
    }
}