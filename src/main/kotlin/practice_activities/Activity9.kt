package practice_activities

fun main(){
    var Oppo = Model("Oppo","Black","Oreo",10, 64) // size is inches, memory is Gb


}

class Model(var brand: String, var color: String, var version: String, var size: Int, var memory: Int,) { // primary constructor

    init {
        println("brand is $brand")
        println("color is $color")
        println("version is $version")
        println("size is $size")
        println("memory is $memory")
    }
// 2nd constructor

}

