package com.oop

open class Person (name:String, age: Int) {
    var name: String = name
    var age: Int = age


    init {
        println("Object Created!")
        println("name is $name, age is $age")
    }


    open fun displayName(){
        println("Name is $name")
    }

    fun displayName(numberOfTimes: Int){
        var ctr = numberOfTimes
        while(ctr >=0){
            println("Name is $name")
            ctr--
        }
    }
}