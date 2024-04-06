 /* 1.	Find the Fibonacci Series up to Nth Term in Java Language
a.	Method 1: Using Iteration (Using Three variables)
  */

package assignment2;
public class Q1
{
    public static void main(String[] args) {
        int N = 10; // Number of terms
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= N; ++i) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
///* Method 2: Using Recursion */
//public class FibonacciRecursion {
//    public static void main(String[] args) {
//        int N = 10; // Number of terms
//        System.out.print("Fibonacci Series: ");
//        for (int i = 0; i < N; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//    static int fibonacci(int n) {
//        if (n <= 1)
//            return n;
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//}
//
//
//
//
///* Output:
//
//Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 
//
//*/
//++++++++++
////Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array) 
//
//public class FibonacciArray{
//    public static void main(String[] args) {
//        int N = 10; // Number of terms
//        int[] fib = new int[N];
//        fib[0] = 0;
//        fib[1] = 1;
//        System.out.print("Fibonacci Series: ");
//        for (int i = 2; i < N; i++) {
//            fib[i] = fib[i - 1] + fib[i - 2];
//            System.out.print(fib[i] + " ");
//        }
//    }
//}
//
///* output:
//Fibonacci Series: 1 2 3 5 8 13 21 34 
//
//*/
//
//
///* Output :
//
//Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 
//*/
