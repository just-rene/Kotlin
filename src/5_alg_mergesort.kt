// impl of https://www.geeksforgeeks.org/merge-sort/

fun main(){
    println("Merge-Sort: ")

    val arr = arrayOf(12, 3, 7, 9) //, 14, 6, 11, 2
    println("Input: " + arr.contentToString())

    sort(arr,0,arr.size-1)


    println("Output: " + arr.contentToString())

    println("average case O(nlog(n))")
    println("worst case O(nlog(n))")

}

fun sort(arr: Array<Int>, l:Int, r:Int ){

    if(l < r){
        val m = l + ( r-l ) / 2
        sort(arr,l,m)
        sort(arr,m+1,r)
        println("$l,$m,$r")

        merge(arr,l,m,r)
    }
}

fun merge(arr:Array<Int>,l:Int,m:Int,r:Int){

    //sizes of the sub-arrays
    val n1 = m - l + 1
    val n2 = r - m

    //temp arrays
    val L =  arr.slice(l..<l+n1)
    val R = arr.slice(m+1..<m+1+n2)


    var i = 0
    var j = 0
    var k = l
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i]
            i++
        } else {
            arr[k] = R[j]
            j++
        }
        k++
    }

    // Copy remaining elements of L[] if any
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }


}