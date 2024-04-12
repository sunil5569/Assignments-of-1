package javaassignment3;
import java.util.Scanner;
public class MainQ3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the number of hours of work per day of the employee: ");
        int hoursOfWorkPerDay = scanner.nextInt();

        Q3 employee = new Q3();
        employee.getInfo(salary, hoursOfWorkPerDay);

        employee.addSal();
        employee.addWork();

        System.out.println("Final salary of the employee: $" + employee.getFinalSalary());

        scanner.close();
    }
}
/*
Output:
Enter the salary of the employee: 20000
Enter the number of hours of work per day of the employee: 8
Final salary of the employee: $20005.0

*/
 