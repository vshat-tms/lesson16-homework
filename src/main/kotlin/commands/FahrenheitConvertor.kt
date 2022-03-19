package commands

import Command

/**
 * Команда f_to_c
 * Пользователь вводит температуру в фаренгейтах (дробное число - Double).
 * Нужно перевести его в цельсии.
 * Количество символов после запятой в выводе не должно быть больше двух.
 * Если пользователь неправильно ввёл число - нужно вывести ошибку.
 */

class FahrenheitConvertor : Command {
    override val keyword = "f_to_c"
    override val description = "Conversion from Fahrenheit to Celsius"

    override fun execute(text: String) {
        val fahrenheit = text.toDoubleOrNull()
        if (fahrenheit == null) {
            println("Некорректный ввод")
            return
        }
        val celsius = (fahrenheit - 32) / 1.8
        println("${String.format("%.2f", fahrenheit)} ℉ = ${String.format("%.2f", celsius)} ℃")
    }
}