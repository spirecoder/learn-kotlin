Printing Fibonacci series upto a given number (n is the number of terms in series)
**KOTLIN**

fun main(args: Array<String>) {
    val n = 100
    var t1 = 0
    var t2 = 1
    print("Upto $n: ")
    while (t1 <= n) {
        print("$t1 + ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}


**JAVA**

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100 , t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
