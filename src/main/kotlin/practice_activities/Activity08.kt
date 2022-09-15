package practice_activities
fun main() {
    println(maxNumber(10,20,30))

}
fun maxNumber(num1:Int, num2: Int, num3:Int):Int{

    if(num1 >= num2 && num1 >= num3)
        println("$num1 is the maxNumber")
    else if(num2 >= num1 && num2 >= num3)
        println("$num2 is the maxNumber")
    else
        println("$num3 is the maxNumber")

    return 1
}



