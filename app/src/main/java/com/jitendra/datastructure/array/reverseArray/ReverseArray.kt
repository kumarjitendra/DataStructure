package com.jitendra.datastructure.array.reverseArray


fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6)
    rvereseArray(arr)
}
fun rvereseArray(arr: IntArray) {
    var n = arr.lastIndex
    for(i in 0 .. n){
        arr[i] = arr[n--]
        println(arr[i])
    }
}
