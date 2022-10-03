package exercises

fun main () {
    var number1: IntArray = intArrayOf(2, 3, 4, 5)
    for (i in number1.indices) {
        println(number1[i])

    }

    var number2: IntArray = intArrayOf(6, 7, 8, 9)
    for (i in number2.indices) {
        println(number2[i])
    }
        println("Lower values:")
        println(number1.min())
        println(number2.min())
        println("Higher Values:")
        println(number1.max())
        println(number2.max())

}


