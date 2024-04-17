package assignment4;
public class Main {
    public static void main(String[] args) {
        try {
            Calculator obj1 = new Calculator(10, 20);
            Calculator obj2 = new Calculator(30, 5);
            Calculator obj3 = new Calculator(-10, 20);
            Calculator obj4 = new Calculator(30, 10);
            System.out.println("=========================");
            int result1 = obj1.add();
            System.out.println("Addition: " + result1);
            System.out.println("=========================");
            int result2 = obj2.subtract();
            System.out.println("Subtraction: " + result2);
            System.out.println("=========================");
            int result3 = obj3.multiply();
            System.out.println("Multiplication: " + result3);
            System.out.println("======================================================");
            int result4 = obj4.divide();
            System.out.println("Division: " + result4);
            System.out.println("======================================================");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
            System.out.println("======================================================");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
            System.out.println("======================================================");
        }
    }
}
/*
Output:
=========================
Addition: 30
=========================
Subtraction: 25
=========================
Multiplication: -200
======================================================
Division: 3
======================================================
*/