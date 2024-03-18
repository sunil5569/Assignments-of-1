/* Write a C program to check whether a triangle is Equilateral, Isosceles or Scalene.
Test Data: */
#include <stdio.h>
int main() 
{
    int side1, side2, side3;
    printf("Enter the lengths of the three sides of the triangle: ");
    scanf("%d %d %d", &side1, &side2, &side3);
    if (side1 == side2 && side2 == side3)
        printf("The triangle is Equilateral.\n");
    else if (side1 == side2 || side1 == side3 || side2 == side3)
        printf("The triangle is Isosceles.\n");
    else
        printf("The triangle is Scalene.\n");
    return 0;
}
/* Output:
Enter the lengths of the three sides of the triangle: 122
123
124
The triangle is Scalene.*/