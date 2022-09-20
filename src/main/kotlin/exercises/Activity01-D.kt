package exercises
fun main() {
    println("Enter the amount you want to save:")

    var amount1: Int = readln().toInt()
    println("Enter another amount:")
    var amount2: Int = readln().toInt()
    var total: Int = amount1+amount2

    println("Total is $total")
    println("Do you want to add another amount?")

    var answer: String = readln()
       if (answer == "No")
           println("Divide the value by how many?")
    var divisor: Int = readln().toInt()
    println("The answer is ${total / divisor}")
    }


