fun main(){
    //
    //array size = 3
    var names = arrayOf("john","paul","Mark")
            println(names[1])

    //explicit
    var numbers = arrayOf<Int>(2,3,10,12,9)
    println(numbers[4])

    //array size
    println(numbers.size)
    println("@@@@@@@@@@@@@")
    println(names[0])
    println(names[1])
    println(names[2])
    //names[1] =" Matthew"
    names.set(1, "Matthew")
    println("@@@@@@@@@@@@@")
   // println(names[0])
    // println(names[1])
    //println(names[2])
    println(names.get(0))
    println(names.get(1))
    println(names.get(2))
}