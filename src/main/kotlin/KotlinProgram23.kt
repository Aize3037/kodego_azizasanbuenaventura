fun main(){
    var result : Int = cube(2)
    println(result)

    println(add(5,2))
}



//with return, with 1 parameter
fun cube(number: Int):Int{
    return number * number * number

}

//with return, with 2 parameter
fun add(number1: Int, number2:Int):Int {
    println("Welcome to the add function!")
    return number1 + number2

}