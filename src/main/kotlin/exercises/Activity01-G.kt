package exercises

fun main () {
 //var array = intArrayOf(2,3,4,5)
 //for(element in array){
 //    print(element)
// }
 var number1: IntArray = intArrayOf(2,3,4,5)
 for (i in number1.indices){
       println(number1[i])
 }
    println("--------------")
    var number2: IntArray = intArrayOf(6,7,8,9)
    for (i in number2.indices){
        println(number2[i])
  }
}
