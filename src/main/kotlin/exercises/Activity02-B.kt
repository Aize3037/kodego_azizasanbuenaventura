package exercises

fun getGreeting(): String = "Hello Student!" // top level variables


fun main(){
    println(getGreeting())
    println("Available Books:")
    var availablebooks = listOf("Math Book","The Little Mermaid","The World War 2","The World of Almanac")
    availablebooks.forEach { availablebooks ->
        println(availablebooks)
    }
    println("Do you want to borrow books?")
    var answer : String = readln().lowercase()

    if (answer == "yes") {
        println("Enter the book you want to borrow:")
        readln()
        println("Thank you for borrowing!")
    }else if(answer == "no"){
        println("Have a nice day!")
    }else{
        println("Invalid Input")
    }

}




