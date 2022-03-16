package commands

import java.util.*

fun main() {
    val myF_to_c = F_to_c()
    myF_to_c.f_to_c()
}

class F_to_c(){
    fun f_to_c(){
        print("Введите значение °F: ")
            val valueF = scanner.nextDouble()
            if (valueF is Double) {
                val celtius: Double = (valueF - 32) / 1.8
                println("°C: ${String.format("%.2f", celtius)}")
            }else{
                throw NumberFormatException("Ошибка... Некорректный ввод.")
            }
        }
    }