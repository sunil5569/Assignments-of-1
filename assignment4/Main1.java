
/*
10.Write the Java program that reads an input string and converts it to an integer, handling the exceptions if the input contains non-digits or if the input is larger than what an integer can store:
*/
package assignment4;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String input = scanner.nextLine();

		try {
			int num = Integer.parseInt(input);
			System.out.println("The number is: " + num);
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input. Please enter a valid number.");
		} catch (Exception e) {
			System.out.println("Error: The number is too large to store in an integer.");
		}

		scanner.close();
	}
}
/*
Output:
1)
Enter a number: 942349 The number is: 942349
2)
Enter a number: abc
Error: Invalid input. Please enter a valid number.
3)
Enter a number: 123456789987456
Error: Invalid input. Please enter a valid number.
 */
