package com.spirecoder

fun getLCSLength(s1: String, s2: String): Int {
    val X = s1.toCharArray()
    val Y = s2.toCharArray()
    val m = X.size
    val n = Y.size
    val L = Array(m + 1) { IntArray(n + 1) }

    for (i in 0..m) {
        for (j in 0..n) {
            if (i == 0 || j == 0)
                L[i][j] = 0
            else if (X[i - 1] == Y[j - 1])
                L[i][j] = L[i - 1][j - 1] + 1
            else
                L[i][j] = Math.max(L[i - 1][j], L[i][j - 1])
        }
    }
    return L[m][n]
}


fun main(args: Array<String>) {
    val lcs = LongestCommonSubsequence()
    val s1 = "SPIRECODER"
    val s2 = "QWCIOUYDER"

    println(
        "LCS length: " + " " +
                lcs.getLCSLength(s1, s2)
    )
}