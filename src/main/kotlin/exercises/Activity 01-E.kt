package exercises
fun main(){
    var word: String = "Serenityo"

    var wordSet = mutableSetOf<Char>()
    println("Serenity".uniqueCharacters())
for(letter in word){
    for(letter2 in word){
        if(letter == letter2){

        }
    }
}
}

fun String.uniqueCharacters(): Boolean =this.toCharArray().distinct().isNotEmpty()