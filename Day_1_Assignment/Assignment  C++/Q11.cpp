/*Write a C program to calculate the root of a Quadratic Equation. */
#include <stdio.h>
#include <math.h>
int main()
 {
    float a, b, c;
    float discriminant, root1, root2;
    printf("Enter coefficients a, b, and c: ");
    scanf("%f %f %f", &a, &b, &c);
    discriminant = b * b - 4 * a * c;
    if (discriminant > 0) {
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        root2 = (-b - sqrt(discriminant)) / (2 * a);
        printf("Roots are real and distinct: %.2f and %.2f\n", root1, root2);
    } else if (discriminant == 0) 
	{
        root1 = root2 = -b / (2 * a);
        printf("Roots are real and equal: %.2f and %.2f\n", root1, root2);
    } else 
	{
        float realPart = -b / (2 * a);
        float imaginaryPart = sqrt(-discriminant) / (2 * a);
        printf("Roots are complex and imaginary: %.2f + %.2fi and %.2f - %.2fi\n",
               realPart, imaginaryPart, realPart, imaginaryPart);
    }
    return 0;
}

/* Output: 
Enter coefficients a, b, and c: 5 6 7
Roots are complex and imaginary: -0.60 + 1.02i and -0.60 - 1.02i */