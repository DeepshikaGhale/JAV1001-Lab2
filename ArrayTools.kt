/*
* Deepshika Ghale
* Student ID: A00272439
* Program name: App Development for Android
* Program code: JAV1001
* Assignment 2
*/

fun main(){

    val encryptedText = encrypt("phone", 3)
    println(encryptedText)

    //tests array average function
    testArrayAvgFun()

    //tests array contains function
    testArrayContainsFun()

    //tests reverse function
    testReverseArrayFun()
}

//encrypt using Caesar cipher using shift value
fun encrypt(normalText: String, shiftValue: Int): String{
    var alphbetLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var encryptedText = ""
    //converting all normalText characters to uppercase for making encryption
    var uppercaseText = normalText.uppercase()

    //loop goes through the uppercaseText acheived from normalText
    for (s in uppercaseText){
        //loop goes through the alphabet letters to get the index of the character
        for (i in alphbetLetters.indices){
            //compares the upperText characters with the alphabet letters
            if (s == alphbetLetters[i]){
                /*
                Here, the caesar cipher formula is used for encryption where,
                - i is the key
                - shiftValue provides by how much the alphabet shoud shift
                - 26 is the total length of alphabet letters
                 */
                val code = (i + shiftValue)%26
                //code is used as an index in the alphbetLetters to find the appropraite letter for encryption
                encryptedText += alphbetLetters[code]
            }
        }
    }

    return "The encrypted text for $normalText is: $encryptedText"
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

//test array average function
fun testArrayAvgFun(){
    //initialize test and result of the reversed arrays
    val t1 = arrayOf<Int>(1,2,3,4,5)
    val r1 = 7.5
    val t2 = arrayOf<Int>(11,21,42,73,94,51)
    val r2 = 146.0
    val t3 = arrayOf<Int>()
    val r3 = 0.0

    //initialize array for tests and results
    val tests = arrayOf(t1,t2,t3)
    val results = arrayOf(r1,r2,r3)

    //loop to go through the array of tests and results
    for (i in tests.indices){
        val arrayAverage = arrayAvg(tests[i]) //pass the test array inside the array average function
        //compares the value of arrayAverage and results
        if (arrayAverage == results[i]){
            println("Array average test t${i+1} passed!")
        }else{
            println("Array average test t${i+1} failed!")
        }
    }
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

//test arrayContains function
fun testArrayContainsFun(){
    //initialize test and result of the reversed arrays
    val t1 = arrayOf<Int>(1,2,3,4,5)
    val va1 = 5
    val r1 = true
    val t2 = arrayOf<Int>(11,21,42,73,94,51)
    val va2 = 73
    val r2 = true
    val t3 = arrayOf<Int>()
    val va3 = 10
    val r3 = false

    //initialize array for tests and results
    val tests = arrayOf(t1,t2,t3)
    val searchValues = arrayOf(va1, va2, va3)
    val results = arrayOf(r1,r2,r3)

    //loop to go through the array of tests and results
    for (i in tests.indices){

        //pass the test array and searchValue inside the arrayContains function
        val containsValue = arrayContains(tests[i], searchValues[i])
        //compare the value of containsValue and results
        if (containsValue == results[i]){
            println("Array contains test t${i+1} passed!")
        }else{
            println("Array contains test t${i+1} failed!")
        }
    }
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

//test reverse array function
fun testReverseArrayFun(){
    //initialize test and result of the reversed arrays
    val t1 = arrayOf<Int>(1,2,3,4,5)
    val r1 = arrayOf<Int>(5,4,3,2,1)
    val t2 = arrayOf<Int>(11,21,42,73,94,51)
    val r2 = arrayOf<Int>(51,94,73,42,21,11)
    val t3 = arrayOf<Int>()
    val r3 = arrayOf<Int>()

    //initialize array for tests and results
    val tests = arrayOf(t1,t2,t3)
    val results = arrayOf(r1,r2,r3)

    //loop to go through the array of tests and results
    for (i in tests.indices){
        val reversedArray = reverse(tests[i]) //pass the test array inside the reverse function
        /*
        - contentEquals compares the value inside of the array
        - here, contentEquals is used to compare value inside reversedArray and array of results
        - if the values are equal then passed is printed otherwise failed
         */
        if (reversedArray contentEquals results[i]){
            println("Reverse array test t${i+1} passed!")
        }else{
            println("Reverse array test t${i+1} failed!")
        }
    }
}

