/* 3.Factorial of a Number using Recursion in Java */
package assignment2;

public class Q3{

 static int factorial(int n) {
    
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
 }

 public static void main(String[] args) {
    int number = 6; 
    System.out.println("Factorial of " + number + " is: " + factorial(number));
 }
}


/* output:
Factorial of 6 is: 720
*/
