package com.spirecoder

fun main(args: Array<String>) {
    val arr = intArrayOf(4, 53, 10, 12, 4, 13)
    val sortedList = quickSort(arr, 0, arr.size - 1)
    println("Sorted: $sortedList")
}

fun quickSort(arr: IntArray, start: Int, end: Int) {

    val partition = partition(arr, start, end)

    if (partition - 1 > start) {
        quickSort(arr, start, partition - 1)
    }
    if (partition + 1 < end) {
        quickSort(arr, partition + 1, end)
    }
}

fun partition(arr: IntArray, start: Int, end: Int): Int {
    var start = start
    val pivot = arr[end]

    for (i in start until end) {
        if (arr[i] < pivot) {
            val temp = arr[start]
            arr[start] = arr[i]
            arr[i] = temp
            start++
        }
    }

    val temp = arr[start]
    arr[start] = pivot
    arr[end] = temp

    return start
}
