fun main(){

    //println(total(2,4,5,5))
 var numbers = arrayListOf<Int>()

   println(total2(2,4,6,5,6,8,7,8))
}

fun total(num1: Int, num2: Int, num3: Int, num4: Int=10):Int{
 println("This is total function")
    return num1 + num2 + num3 + num4
}


fun total2(vararg numbers: Int):Int{
var sumOfAllNumbers: Int = 0;
    for(num in numbers){
        sumOfAllNumbers = sumOfAllNumbers + num
    }
    return sumOfAllNumbers
}