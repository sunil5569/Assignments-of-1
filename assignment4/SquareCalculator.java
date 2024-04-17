/*
5.Write a program to calculate the square value of any number given by the user .Add an exception handling block to check whether the user enter letters instead of numbers
*/
package assignment4;
import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            
            double square = calculateSquare(number);
            System.out.println("Square of " + number + " is: " + square);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }

    public static double calculateSquare(double number) {
        return number * number;
    }
}


/*
Output:
1)
Enter a number: 15
Square of 15.0 is: 225.0
2)
Enter a number: a
Invalid input. Please enter a valid number.
*/