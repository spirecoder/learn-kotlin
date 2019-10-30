package com.spirecoder

fun getLISLength(arr: IntArray, n: Int): Int {
    val lis = IntArray(n)
    var i: Int
    var j: Int
    var max = 0

    i = 0
    while (i < n) {
        lis[i] = 1
        i++
    }

    i = 1
    while (i < n) {
        j = 0
        while (j < i) {
            if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                lis[i] = lis[j] + 1
            }
            j++
        }
        i++
    }

    i = 0
    while (i < n) {
        if (max < lis[i]) {
            max = lis[i]
        }
        i++
    }
    return max
}


fun main(args: Array<String>) {
    val arr = intArrayOf(50, 3, 10, 7, 40, 80)
    val n = arr.size
    println("LIS length: " + getLISLength(arr, n))
}
