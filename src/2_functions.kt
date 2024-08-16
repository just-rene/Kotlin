//functions
fun main() {
    //function call with default param
    sayHello() //basic function with default
    sayHelloWithUnit() // same with unit return type
    sayHelloMoreEasily() //single-expression function
    sayHelloToEveryone("Java","Kotlin","001010101") //vararg
    "moin" specialGreeting "kotlin" //infix
}

//function definition with default
fun sayHello(name:String = "Kotlin" ){
    println("Hello $name")
}

//same with Unit return type (is optional),
//is like void in java
fun sayHelloWithUnit(name:String = "Kotlin" ) : Unit{
    println("Hello $name")
}

//Single-expression functions
fun sayHelloMoreEasily(name:String = "Kotlin") = println("Hello $name")

//vararg -> takes a list of length n as input
fun sayHelloToEveryone(vararg names: String){
    for (name in names){
        println("Hello $name")
    }
}

//infix function (omitting the dot and the parentheses for the call)
infix fun String.specialGreeting(name:String){
    println("$this $name")
}



