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

    val contains = arrayContains(array, 6)
    println(contains)
}

//accepts an array and a search value, and determines if the array contains the value (true/false)
fun arrayContains(array: Array<Int>, searchValue: Int): Boolean{

    //loop goes through the element of given parameter array
    for (i in array.indices){

        //if search value is equal to any element of given array then it returns true
        if(searchValue == array[i]){
            return true
        }
    }

    //if the search value is not found in the array
    return false
}


//reverses an array
fun reverse(originalArray: Array<Int>): Array<Int>{
    //store reversed array
    var reversedArray = arrayOf<Int>()

    //create loop to pass index according to the size of the original array
    for(i in originalArray.size - 1 downTo 0){
        reversedArray += originalArray[i]
    }

    return  reversedArray
}

