fun main () {
    var grade: Int = 101

    if ((grade >= 96) && (grade <= 100)) {
        print("1.00")
    } else if ((grade >= 86) && (grade <= 95)) {
        println("1.75")
    } else if ((grade >= 76) && (grade <= 85)) {
        println("2.25")
    } else if (grade < 75) {
        println("5.0")
    } else {
        println("Invalid grade!")
    }
}



