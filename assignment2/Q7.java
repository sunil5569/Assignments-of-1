/*Rotate a matrix by 90 degree in clockwise direction in Java.*/
package assignment2;
import java.util.Scanner;
public class Q7 {

	public static void rotateMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			int start = 0;
			int end = matrix[0].length - 1;
			while (start < end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = scanner.nextInt();

		int[][] matrix = new int[rows][columns];
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		rotateMatrix(matrix);

		System.out.println("Matrix after 90 degree clockwise rotation:");
		printMatrix(matrix);

		scanner.close();
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
}

/*/*
 Enter number of rows: 3
Enter number of columns: 3
Enter the elements of the matrix:
1
2
3
4
5
6
7
8
9
Original Matrix:
1 2 3 
4 5 6 
7 8 9 
Matrix after 90 degree clockwise rotation:
7 4 1 
8 5 2 
9 6 3 */