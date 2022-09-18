package exercises
fun main() {
    println("Enter a word:")
    var originalString1 = "madam"
    readln()

    var reverseString = originalString1.reversed()

    if (originalString1 == reverseString) {
        println("The given string is Palindrome")
    } else {
        println("The given string is NOT a Palindrome")

    }
}




