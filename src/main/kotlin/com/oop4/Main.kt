package com.oop4

fun main() {
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

    println("------------")
    var library = Library()
    library.toRead()
    library.lendBooks()
    library.toStudy()

    println("--------------")

    println("Enter the letter you want to borrow:")
    var letter = readLine()!!.toString()
    when (letter) {
        "a" -> println("Dracula")
        "b" -> println("The Little Mermaid")
        "c" -> println("World Almanac")
        else -> println("Please try again")
    }
    println("Thank you for borrowing!")
}

