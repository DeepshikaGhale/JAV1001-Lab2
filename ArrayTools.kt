/*
* Deepshika Ghale
* Student ID: A00272439
* Program name: App Development for Android
* Program code: JAV1001
* Assignment 2
*/

fun main(){
    val array = arrayOf<Int>(1,2,3,4,5)
    val reversedArray = reverse(array)
    println(reversedArray.contentToString())
}

//reverse function to reverse array
fun reverse(originalArray: Array<Int>): Array<Int>{
    //store reversed array
    var reversedArray = arrayOf<Int>()

    //create loop to pass index according to the size of the original array
    for(i in originalArray.size - 1 downTo 0){
        reversedArray += originalArray[i]
    }

    return  reversedArray
}

