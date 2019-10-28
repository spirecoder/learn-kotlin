package com.spirecoder;

public class FibonacciSeries {
    //Using recursion
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Using dynamic programming
    static int fibonacciDp(int n) {
        int f[] = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println(fibonacci(n));
        System.out.println(fibonacciDp(n));
    }
}
