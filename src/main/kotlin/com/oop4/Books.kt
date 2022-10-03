package com.oop4

open class Books() {
    var books = arrayListOf("a.Dracula", "b.The Little Mermaid", "c.World Almanac")
    var genre = arrayListOf("a.Horror", "b.Fantasy", "c.History")
    var type = arrayListOf("a.Fictional", "b.Children's book", "c.Educational")

  open fun showBooks() {
        for (books in books) {
            println(books)
        }
    }
   open fun showGenre(){
       for(genre in genre){
           println(genre)
       }
   }
    open fun showType(){
       for(type in type){
           println(type)
       }
   }
}


