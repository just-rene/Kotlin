
//Classes and inheritance
fun main() {

    val person = SpecificPerson()
    person.sayYourName()
}
//basic initialization
class Person(firstName: String, lastName:String,age:Int ) { /*...*/ }

//make props immutable with val
class PersonImmutable(firstName: String, lastName:String,val age:Int ) { /*...*/ }

//define abstract class and extend it
abstract class AbstractPerson{
    abstract val firstName: String
    abstract fun sayYourName()
}

class SpecificPerson : AbstractPerson() {
    override val firstName = "John"

    override fun sayYourName() {
        println(firstName)
    }

}




