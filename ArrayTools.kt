/*
* Deepshika Ghale
* Student ID: A00272439
* Program name: App Development for Android
* Program code: JAV1001
* Assignment 2
*/

fun main(){
    testReverseArrayFun()
}

//accepts an array and produces the average of all values
fun arrayAvg(array: Array<Int>): Double {
    //initialized to store the sum of all elements of parameter array
    var sumOfInteger: Int = 0

    //loop goes through the element of given parameter array
    for (i in array.indices) {
        //collect the sum of integer of array elements
        sumOfInteger += array[i]
    }

    //average value of an array
    return (sumOfInteger / 2.0)
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

fun testReverseArrayFun(){
    val t1 = arrayOf<Int>(1,2,3,4,5)
    val r1 = arrayOf<Int>(5,4,3,2,1)
    val t2 = arrayOf<Int>(11,21,42,73,94,51)
    val r2 = arrayOf<Int>(51,94,73,42,21,11)
    val t3 = arrayOf<Int>()
    val r3 = arrayOf<Int>()

    val tests = arrayOf(t1,t2,t3)
    val results = listOf(r1,r2,r3)

    for (i in tests.indices){
        val reversedArray = reverse(tests[i])
        if (reversedArray contentEquals results[i]){
            println("Test t${i+1} passed!")
        }else{
            println("Test t${i+1} failed!")
        }
    }
}

