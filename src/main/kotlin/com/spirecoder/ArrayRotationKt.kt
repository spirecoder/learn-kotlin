package com.spirecoder

object ArrayRotationKt {

    private fun reverseArrayWithKotlinFunction(arrayToRevert: IntArray): IntArray {
        return arrayToRevert.reversedArray()
    }

    private fun reverseArray(arrayToRevert: IntArray): IntArray {
        for (i in 0 until arrayToRevert.size / 2) {
            val temp = arrayToRevert[i]
            arrayToRevert[i] = arrayToRevert[arrayToRevert.size - i - 1]
            arrayToRevert[arrayToRevert.size - i - 1] = temp
        }

        return arrayToRevert
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arrayToRevert = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = reverseArray(arrayToRevert)
        println(result.contentToString())

        val arrayToRevertWithKotlinFunction = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val resultWithKotlinFunction = reverseArrayWithKotlinFunction(arrayToRevertWithKotlinFunction)
        println(resultWithKotlinFunction.contentToString())
    }
}