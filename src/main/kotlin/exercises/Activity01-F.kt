package exercises
fun main() {
  println("Word: \"madam\"")
  println("isPalindrome : ${isPalindrome("madam")}")
  println("---------------------------")
  println("Word: \"jello\"")
  println("isPalindrome : ${isPalindrome("jello")}")
}
    fun isPalindrome(text:String): Boolean {
     //   val textLen = text.length
    //    println(text)
     //   if(text.length < 2) {
     //       return true
        return text == text.reversed()
    }
      //  return text.first() == text.last()
      //          && isPalindrome(text.substring(1,textLen-1))



