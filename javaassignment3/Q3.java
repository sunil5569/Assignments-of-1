/*
3. Write a program by creating an Employee class having the following methods
and print the final salary.
a. getInfo() which takes the salary, number of hours of work per day of employee as parameter
b. AddSal() which adds $10 to salary of the employee if it is less than $500.
c.AddWork() which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
*/
package javaassignment3;
import java.util.Scanner;
	public class Q3 {
		    private double salary;
		    private int hoursOfWorkPerDay;

		    public void getInfo(double salary, int hoursOfWorkPerDay) 
		    {
		        this.salary = salary;
		        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
		    }

		    public void addSal()
		    {
		        if (salary < 500)
		        {
		            salary += 10;
		        }
		    }

		    public void addWork()
		    {
		        if (hoursOfWorkPerDay > 6) 
		        {
		            salary += 5;
		        }
		    }

		    public double getFinalSalary() 
		    {
		        return salary;
		    }
	}
