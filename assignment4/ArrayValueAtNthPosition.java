/*
6.Create an integer array of size n and read the elements from the user .Add an exception handling block to print the value at nth position of the array
*/
package assignment4;
import java.util.Scanner;
public class ArrayValueAtNthPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            // Reading elements into the array
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            // Reading the value at nth position
            System.out.print("Enter the position to get the value: ");
            int position = scanner.nextInt();
            int value = getValueAtPosition(arr, position);
            System.out.println("Value at position " + position + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position. Please enter a valid position within the array bounds.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }

    public static int getValueAtPosition(int[] arr, int position) {
        return arr[position - 1];
    }
}


/*
Output:
Enter the size of the array: 5
Enter 5 elements:
10
20
30
40
50
Enter the position to get the value: 3
Value at position 3 is: 30
*/