package com.spirecoder

object FibonacciSeriesKt {
    //Using recursion
    internal fun fibonacci(n: Int): Int {
        return if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
    }

    //Using dynamic programming
    internal fun fibonacciDp(n: Int): Int {
        val f = IntArray(n + 2)
        var i: Int
        f[0] = 0
        f[1] = 1
        i = 2
        while (i <= n) {
            f[i] = f[i - 1] + f[i - 2]
            i++
        }
        return f[n]
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 9
        println(fibonacci(n))
        println(fibonacciDp(n))
    }
}