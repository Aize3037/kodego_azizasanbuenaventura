package exercises

fun main() {

  var setA = mutableSetOf<Char>()
  println("Enter String 1:")
  var string1: String = readln()
  for (letter in string1){
    setA.add(letter)
  }

  var setB = mutableSetOf<Char>()
  println("Enter String 2:")
  var string2: String = readln()
  for(letter in string2){
    setB.add(letter)
  }

  println("The unique in set A is ${setA.minus(setB)}")
  println("The unique in set B is ${setB.minus(setA)}")
}
