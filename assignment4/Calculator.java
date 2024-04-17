/*
9.Write a program that creates a Calculator class.
The class contains two variables of integer type. Design a constructor that accepts two values as parameter and set those values.

Design four methods named Add(),Subtract(),multiply(),Division() for performing addition,subtraction,multiplication and division of two numbers.

For addition and subtraction,two numbers should be positive.If any negative number is entered then throw an exception in respective methods.

So design an exceptionhandler(ArithmeticException)in Add() and Subtract() methods respectively to check whether any number is negative or not.

For division and multiplication two numbers should not be zero.If zero is entered for any number then throw an exception in respective methods.
So design an exceptionhandler(ArithmeticException)inmultiply()andDivision()methods respectively to check whether any number is zero or not.

Write a main class and declare four objects of Calculator class.Perform addition(objl),subtraction(obj2),multiply(obj3) and division(obj4) operations for these objects.
If any non integer values are provided as input; then you should throw an exception(NumberFormatException)and display a message that informs the user of the wrong input before exiting

*/

package assignment4;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Both numbers should be positive for addition.");
        }
        return num1 + num2;
    }

    public int subtract() {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Both numbers should be positive for subtraction.");
        }
        return num1 - num2;
    }

    public int multiply() {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Both numbers should not be zero for multiplication.");
        }
        return num1 * num2;
    }

    public int divide() {
        if (num2 == 0) {
            throw new ArithmeticException("The second number should not be zero for division.");
        }
        return num1 / num2;
    }
}