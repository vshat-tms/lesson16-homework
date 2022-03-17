package commands

fun main() {
    val fahrenheitToCelsius = FahrenheitToCelsius()
    fahrenheitToCelsius.f_to_c()
}

class FahrenheitToCelsius(){
    fun f_to_c(){
        print("Введите значение °F: ")
            val valueF = scanner.nextDouble()
            if (valueF is Double) {
                val celsius: Double = (valueF - 32) / 1.8
                println("°C: ${String.format("%.2f", celsius)}")
            }else{
                throw NumberFormatException("Ошибка... Некорректный ввод.")
            }
        }
    }