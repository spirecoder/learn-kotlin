package com.spirecoder

import kotlin.jvm.JvmStatic
import com.spirecoder.SmallestMissingNumber

class SmallestMissingNumber {
    fun findSmallestMissingSortedArray(arr: IntArray): Int {
        if (arr[0] != 0) return 0
        if (arr[arr.size - 1] == arr.size - 1) return arr.size
        val first = arr[0]
        return findFirstMissing(arr, 0,
                arr.size - 1, first)
    }

    fun findFirstMissing(arr: IntArray, start: Int, end: Int, first: Int): Int {
        if (start < end) {
            val mid = (start + end) / 2
            return if (arr[mid] != mid + first) findFirstMissing(arr, start,
                    mid, first) else findFirstMissing(arr, mid + 1,
                    end, first)
        }
        return start + first
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val smallestMissingNumber = SmallestMissingNumber()
            val arr = intArrayOf(8, 1, 2, 3, 4, 5, 7)
            val n = arr.size
            println("Missing element: " + smallestMissingNumber.findSmallestMissingSortedArray(arr))
        }
    }
}