package com.oop4

class Library:Place(),Librarian,Borrower {

    override fun toRead() {
        println("I need a book")
    }
    override fun lendBooks() {
        println("They will lend me a book")
    }

    override fun toStudy() {
        println("I will borrow a book in the library")
    }
}