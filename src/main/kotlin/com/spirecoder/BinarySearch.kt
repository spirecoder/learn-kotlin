package com.spirecoder

private fun search(arr: IntArray, l: Int, r: Int, x: Int): Int {
    if (r >= l) {
        val mid = l + (r - l) / 2
        if (arr[mid] == x)
            return mid

        return if (arr[mid] > x) search(arr, l, mid - 1, x) else search(arr, mid + 1, r, x)
    }

    return -1
}

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 12, 23, 38, 43, 49, 80, 99)
    val n = arr.size
    val x = 80
    val result = search(arr, 0, n - 1, x)
    if (result == -1)
        println("Element not present")
    else
        println("Element found at index $result")
}

