package practice_activities
//fun buyLoad(amount: Double) : Unit
//fun chargeBattery(percent:)
//fun sendText(message: String)
//fun call(minute)

fun main(){

    var phone = SmartPhone(50.0, 35)

}
class SmartPhone(var load: Double, var batteryPercentage: Int){
    init {
        println("Object Created")
        println("Initial value of load is $load and batteryPercentage is $batteryPercentage")

    }
}
