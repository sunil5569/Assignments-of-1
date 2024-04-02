/*
4)Find the second maximum and second minimum Elements of an array.
 */
package Assignmentsloopandarray;
import java.util.*;
public class Array3 
{
	public static void main(String args[])
	{
		int arr[] = { 111, 13, 25, 9, 34, 1 };
		int n = arr.length;
		Arrays.sort(arr);
System.out.println("second maximum element is " + arr[4]);
System.out.println("second minimum element is " + arr[1]);
	}
}