fun main(){


}

class Empty {} // Usually used as placeholder


class outer {

    val name = "Outer"
    fun show() = "The name: $name"

    class Nested { // No access to function in the class where it belongs
        val name = "Nested"
        fun show() = "the name: $name"

        }
    }
class Outer2 {

    val name1 = "Outer2"
    fun show() = "the name: $name1"

    inner class Inner {
        val name2 = "Inner" // Has access to functions in the class where it belongs
        fun show() = "data: $name2 and $name1"
    }
}

// sealed class
// main class
// abstract class
// data class

// sealed class
// open class
// abstract class
// data class