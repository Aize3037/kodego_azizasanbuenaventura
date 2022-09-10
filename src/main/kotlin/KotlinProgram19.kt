fun main(){
    var mylist = listOf(2,5,3,1)//readonly immutable
    var mylist2 = mutableListOf<Int>()// mutable
    mylist2.add(7)
    mylist2.add(8)
    mylist2.add(9)

    mylist2[0] = 10

    for(mylist2Value in mylist2){
        println(mylist2Value)
    }

    //get 2nd element
    println(mylist[1])
    //display size
    println(mylist.size)

    //traverse list
    for(listValue in mylist){
        println(listValue)
    }
}