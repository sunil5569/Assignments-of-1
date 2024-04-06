/* 
2.	Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an 
integer in base 10 which is completely divisible by sum of its digits.
*/


package assignment2;
import java.util.Scanner;
public class Q2  {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number :");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			sum+=temp%10;
			temp=temp/10;
		}
		if(num%sum==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
	}

}

/* output:

Enter the number
10
Harshad Number

*/