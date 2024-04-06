/*
Java program for rotation of elements of array- left and right. An array is
said to be right rotated if all the selected elements were moved towards
right by one position.
*/
package assignment2;
import java.util.Arrays;
public class Q6 {
	public static void leftRotate(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}
	public static void rightRotate(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(array));
		leftRotate(array);
		System.out.println("Left Rotated Array: " + Arrays.toString(array));
		rightRotate(array);
		System.out.println("Right Rotated Array: " + Arrays.toString(array));
	}
}

/*
 Original Array: [1, 2, 3, 4, 5]
Left Rotated Array: [2, 3, 4, 5, 1]
Right Rotated Array: [1, 2, 3, 4, 5]
*/