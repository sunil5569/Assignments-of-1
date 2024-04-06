/*
8.	Create a student class with the following data members:- rollNo, Name,
Course, Mark, grade, result. Develop function members to
a.	assign values for rollNo, name, course and mark.
b.	Find out the grade for the student(if mark >90, then grade is A, if mark is between 80 and 90, then grade is B, if mark is between 70 and 80, then grade is C, if mark is between 60 and 70, then grade is D, otherwise, grade is F.
c.	Find the result of the student. If mark>60, then the result is Pass, otherwise Fail
d.	Print out the details of the student


*/
package assignment2;

public class Q8  {
    private int rollNo;
    private String name;
    private String course;
    private int mark;
    private String grade;
    private String result;
    
    public Q8(int rollNo, String name, String course, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.mark = mark;
        determineGradeAndResult();
    }
    public void assignValues(int rollNo, String name, String course, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.mark = mark;
        determineGradeAndResult();
    }
    private void determineGradeAndResult() {
        if (mark > 90) {
            grade = "A";
            result = "Pass";
        } else if (mark >= 80) {
            grade = "B";
            result = "Pass";
        } else if (mark >= 70) {
            grade = "C";
            result = "Pass";
        } else if (mark >= 60) {
            grade = "D";
            result = "Pass";
        } else {
            grade = "F";
            result = "Fail";
        }
    }
    public void printDetails() {
    	System.out.println("==================================");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        Q8 student = new Q8(57, "Sunil Patil", "Mechanical Engg.", 90);
        student.printDetails();
        System.out.println("==================================");
        student.assignValues(25, "Sudarshan Deore", "Computer Science", 78);
        student.printDetails();
    }
}


/* Output:
==================================
Roll No: 57
Name: Sunil Patil
Course: Mechanical Engg.
Mark: 90
Grade: B
Result: Pass
==================================
==================================
==================================
Roll No: 25
Name: Sudarshan Deore
Course: Computer Science
Mark: 78
Grade: C
Result: Pass
==================================
*/