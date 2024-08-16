// impl of "Introduction to Algorithms 4th" site 19

fun main(){
    println("Insertion-Sort: ")

    val A = arrayOf(5, 2, 4, 6, 1, 3)
    println("Input: " + A.contentToString())

    for (i in 1..<A.size){

        val value = A[i]
        var j = i-1

        while (j >= 0 && A[j] > value){
            A[j+1] = A[j]
            j = j-1
        }
        A[j+1] = value
    }

    println("Output: " + A.contentToString())

    println("average case O(n²)")
    println("worst case O(n²)")

}