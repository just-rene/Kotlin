
//var vs val
//var array reference is mutable
//val array reference is immutable,elements can still be changed
fun main() {

    var a = arrayOf(1,234,2,21,5,16,611)
    a = arrayOf(1)
    println(a.contentToString())


    val b = arrayOf(1,234,2,21,5,16,611)
    //throws exception
    b = arrayOf(1)
    println(b.contentToString())
}