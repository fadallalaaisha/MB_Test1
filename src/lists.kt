fun introduction(name:String,age:Int){
    println("My name $name and I am $age old.")

}

fun age(){
    if (age< 6){
        println("Milk")
    }
    else if (age<=15){
        println("Bottle of fanta")}
    else {
        println("cocacola")}
}

fun Names(){
    var name= arrayOf("Fatuma","Dina","Mandek","Fadallala")
    for(a in name ){
        println("a")
    }
}
fun multiply(a:Int,b:Int){
    var c=a*b;
    println(c)
}
fun divid(num:Int,num1:Int){
    var a=num/num1
    println(a)
}
fun remainder(x:Int,y:Int){
    var z=x%y
    println(z)
}
class Human(var name:String, var age:Int,var weight:Int){
    fun  eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech: String){
        println("I was $speech")
    }
    fun birthday( ){
        age=1
        age++
        println(age)
    }
}

fun main() {
    var Intr=introduction("Aisha",17)
    //println("My name $name and I am $age old.")
    //age()
    //Names()
    multiply(3,5)
    divid(77,7)
    remainder(55,3)
    var human=Human("Halima",33,66)
    human.weight
    human.speak("coming")

}