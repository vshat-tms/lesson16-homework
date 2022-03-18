package hwLesson16

fun fizzbuzz(input: String) {
    try {
        val item = input.toInt()

        if (item in 20..100) {
            for (i in 1..item) {
                when {
                    i % 15 == 0 -> println("FizzBuzz")
                    i % 3 == 0 -> println("Fizz")
                    i % 5 == 0 -> println("Buzz")
                    else -> println(i)
                }
            }
        } else {
            println("$input is not correct")
        }
    } catch (e: NumberFormatException) {
        println("$input is not correct")
    }
}
