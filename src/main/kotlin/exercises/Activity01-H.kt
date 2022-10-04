package exercises

fun getGreeting1(): String = "Hello Student!"

fun main() {
    println(getGreeting1())
    println("Here's the available books:")
    var booksToLend = arrayListOf<String>(".The 3 little pigs", "Snow white and the 7 dwarf", "Harry Potter")
    var kindofBooks = arrayListOf<String>("Children's Book", "Fantasy", "Fictions")
    println(booksToLend)
    println(kindofBooks)
    println("----------------------------")
    println("Do you want to borrow books?")
    var answer: String = readln().lowercase()

    if (answer == "yes") {
        println("Enter the books you want to borrow:")
        readln()
        println("Thank you for borrowing!")
    } else if (answer == "no") {
        println("Have a nice day!")

    } else {
        println("Invalid Input")
    }
}


