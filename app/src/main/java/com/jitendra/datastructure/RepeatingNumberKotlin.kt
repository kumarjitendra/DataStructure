package com.jitendra.datastructure

 object RepeatingNumberKotlin {
    var result = 0
    fun getTwoElements(arr: IntArray, n: Int) {
        /* Will hold xor of all elements
	and numbers from 1 to n */
        var xor1: Int
        /* Will have only single set bit of xor1 */
        val set_bit_no: Int
        var i: Int
        result = 0
        xor1 = arr[0]

        /* Get the xor of all array elements */i = 1
        while (i < n) {
            xor1 = xor1 xor arr[i]
            i++
        }

        /* XOR the previous result with numbers from
	1 to n*/i = 1
        while (i <= n) {
            xor1 = xor1 xor i
            i++
        }

        /* Get the rightmost set bit in set_bit_no */set_bit_no = xor1 and (xor1 - 1).inv()

        /* Now divide elements into two sets by comparing
	rightmost set bit of xor1 with the bit at the same
	position in each element. Also, get XORs of two
	sets. The two XORs are the output elements. The
	following two for loops serve the purpose */i = 0
        while (i < n) {
            if (arr[i] and set_bit_no != 0)
                result = result xor arr[i]
            i++
        }
        i = 1
        while (i <= n) {
            if (i and set_bit_no != 0) result = result xor i
            i++
        }

    }



    /* Driver program to test above function */
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1,0)
        val n = arr.size
        getTwoElements(arr, n)
        println(
            "repeating number is "
                    + result
        )
    }
}