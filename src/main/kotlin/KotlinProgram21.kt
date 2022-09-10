fun main(){
//instantiation - process of creating an object
    var myObject = MyClass("Hello World")
    var myGenericObject = MyGenericClass(3.1416)

}
//Generics
class MyGenericClass<T>(value:T) {

    init {
        println(value.toString().length)
    }
}
    class MyClass(value: String) {
        init {
            println(value.length)

    }
}


/*
class -> value
object ->

 */