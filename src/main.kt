fun main(){
    oddNumbers()
    var y=names(arrayOf("Me","lily","Moon","Yas","kanini","Nyamz"))
    println(y)
    partyRob(10)
    partyRob(11)
    partyRob(70)
    multiples()



}
fun oddNumbers(){
    for (num in 1..100)
        if (num %2 !==0)
            println(num)
}
fun names(people:Array<String>):Int{
    var num= 0
    people.forEach { people ->
        if (people.length > 5)
            num++
    }
    return num
}
fun partyRob(Age:Int){
    if(Age<6){
        println("Can i have milk?")
    }
    else if (Age < 15 && Age > 6){
        println("Fanta Orange Served")
    }
    else
        println("Everyone gets cocacola")
}
fun multiples(){
    for (num in 1..100)
        if (num%3 ==0 && num%5==0){
            println("FIZZ")
        }
    else if(num%3==0){
        println("BUZZ")
        }
    else
        println(num)

}

