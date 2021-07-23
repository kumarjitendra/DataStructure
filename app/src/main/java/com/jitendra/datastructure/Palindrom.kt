package com.jitendra.datastructure.array

// A recursive Java program to
// check whether a given number
// is palindrome or not


object CheckPallindromNumberRecursion {
    // A function that reurns true
    // only if num contains one digit
    fun oneDigit(num: Int): Int {
        return if (num >= 0 && num < 10) 1 else 0
    }

    @Throws(Exception::class)
    fun isPalUtil(num: Int, dupNum: Int): Int {

        // base condition to return once we
        // move past first digit
        var dupNum = dupNum
        dupNum = if (num == 0) {
            return dupNum
        } else {
            isPalUtil(num / 10, dupNum)
        }

        // Check for equality of first digit of
        // num and dupNum
        return if (num % 10 == dupNum % 10) {
            // if first digit values of num and
            // dupNum are equal divide dupNum
            // value by 10 to keep moving in sync
            // with num.
            dupNum / 10
        } else {
            // At position values are not
            // matching throw exception and exit.
            // no need to proceed further.
            throw Exception()
        }
    }

    @Throws(Exception::class)
    fun isPal(num: Int): Int {
        var num = num
        if (num < 0) num = -num
        val dupNum = num
        return isPalUtil(num, dupNum)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 1242
        try {
            isPal(n)
            println("Yes")
        } catch (e: Exception) {
            println("No")
        }

    }
}

// This code is contributed
