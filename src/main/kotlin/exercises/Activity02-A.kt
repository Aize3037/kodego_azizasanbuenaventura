package exercises

fun getMyGrocerylist(): String = "My Grocery List:"

fun main() {
    println(getMyGrocerylist())
    var myItems = listOf("1.Canned Tuna,\n2.Powdered Milk,\n3.Detergent,\n4.Shampoo")
    myItems.forEach{ myItems ->
        println(myItems)
    }
    
    println("Enter the number you want to purchase:")
    var number: Int = readln().toInt()

    if(number == 1) {
    println("Canned Tuna")
    }else if (number == 2){
        println("Powdered Milk")
    }else if (number == 3){
        println("Detergent")
    }else if (number == 4){
        println("Shampoo")
    }else{
        println("Invalid Number")
    }
}