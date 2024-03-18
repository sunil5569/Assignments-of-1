/* Write a C program to check whether a triangle can be formed by the given value for the angles.
	Test Data: */
#include <stdio.h>
int main() {
    int angle1, angle2, angle3;
    printf("Enter the three angles of the triangle: ");
    scanf("%d %d %d", &angle1, &angle2, &angle3);
    if (angle1 + angle2 + angle3 == 180)
        printf("The given angles can form a triangle.\n");
    else
        printf("The given angles cannot form a triangle.\n");
    return 0;
}

/* Output:
Enter the three angles of the triangle:  50 60 70
The given angles can form a triangle. */