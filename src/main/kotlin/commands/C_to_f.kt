package commands

fun main() {
    val myC_to_f = C_to_f()
    myC_to_f.c_to_f()
}

class C_to_f(){
    fun c_to_f(){
            print("Введите значение °C: ")
            val valueC = scanner.nextDouble()
        if (valueC is Double) {
            val fahrenheit: Double = valueC * 1.8 + 32
            println("°F: ${String.format("%.2f", fahrenheit)}")
        }else {
            throw Exception("Ошибка... Некорректный ввод.")
        }
    }
}
