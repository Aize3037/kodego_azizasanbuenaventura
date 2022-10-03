package com.oop4

fun main(){
    println("Welcome to the library:")
    println("Here's the available books!")
    println("----------")
    println("Available Books:")
    var bookListed = Books()
    bookListed.showBooks()
    println("-----------")
    println("Genre:")
    bookListed.showGenre()
    println("-----------")
    println("Type of Books:")
    bookListed.showType()

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

