/* 9.Write a C program to accept a coordinate point in a X and Y coordinate system and determine in which quadrant the coordinate point lies. */
	#include <stdio.h>
    int main() {
    float x, y;
    printf("Enter the coordinates (x, y): ");
    scanf("%f %f", &x, &y);
    if (x > 0 && y > 0)
        printf("The point (%.2f, %.2f) lies in the first quadrant.\n", x, y);
    else if (x < 0 && y > 0)
        printf("The point (%.2f, %.2f) lies in the second quadrant.\n", x, y);
    else if (x < 0 && y < 0)
        printf("The point (%.2f, %.2f) lies in the third quadrant.\n", x, y);
    else if (x > 0 && y < 0)
        printf("The point (%.2f, %.2f) lies in the fourth quadrant.\n", x, y);
    else if (x == 0 && y == 0)
        printf("The point (%.2f, %.2f) is at the origin.\n", x, y);
    else if (x == 0)
        printf("The point (%.2f, %.2f) lies on the y-axis.\n", x, y);
    else
        printf("The point (%.2f, %.2f) lies on the x-axis.\n", x, y);
    return 0;
}

/*
Output:
Enter the coordinates (x, y): 5 7
The point (5.00, 7.00) lies in the first quadrant.
*/