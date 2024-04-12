/*2.Print the sum, difference and product of two complex numbers by creating a class, named Complex with separate methods for each operation whose real and imaginary parts are entered by user .
Use Constructors to initialize the data members
*/
package javaassignment3;
import java.util.Scanner; 
public class Q2
{
    private double real;
    private double imaginary;

    public Q2(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Q2 add(Q2 other) {
        return new Q2(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Q2 subtract(Q2 other) {
        return new Q2(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Q2 multiply(Q2 other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Q2(realPart, imaginaryPart);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();
        Q2 complex1 = new Q2(real1, imaginary1);

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();
        Q2 complex2 = new Q2(real2, imaginary2);

        Q2 sum = complex1.add(complex2);
        Q2 difference = complex1.subtract(complex2);
        Q2 product = complex1.multiply(complex2);

        System.out.println("Sum of the two complex numbers: " + sum.real + " + " + sum.imaginary + "i");
        System.out.println("Difference of the two complex numbers: " + difference.real + " + " + difference.imaginary + "i");
        System.out.println("Product of the two complex numbers: " + product.real + " + " + product.imaginary + "i");

        scanner.close();
    }
}
