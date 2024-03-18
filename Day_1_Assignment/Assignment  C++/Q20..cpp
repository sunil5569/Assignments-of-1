/*Write a program in C which is a Menu-Driven Program to compute the area of the various geometrical shape.*/
        #include <stdio.h>
#include <math.h>

#define PI 3.14159265359

// Function prototypes
float areaOfRectangle(float length, float width);
float areaOfSquare(float side);
float areaOfCircle(float radius);
float areaOfTriangle(float base, float height);

int main() {
    int choice;
    float length, width, side, radius, base, height;

    do {
      
        printf("\n\n***** MENU *****\n");
        printf("1. Area of Rectangle\n");
        printf("2. Area of Square\n");
        printf("3. Area of Circle\n");
        printf("4. Area of Triangle\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("Enter length and width of rectangle: ");
                scanf("%f %f", &length, &width);
                printf("Area of Rectangle: %.2f\n", areaOfRectangle(length, width));
                break;
            case 2:
                printf("Enter side of square: ");
                scanf("%f", &side);
                printf("Area of Square: %.2f\n", areaOfSquare(side));
                break;
            case 3:
                printf("Enter radius of circle: ");
                scanf("%f", &radius);
                printf("Area of Circle: %.2f\n", areaOfCircle(radius));
                break;
            case 4:
                printf("Enter base and height of triangle: ");
                scanf("%f %f", &base, &height);
                printf("Area of Triangle: %.2f\n", areaOfTriangle(base, height));
                break;
            case 5:
                printf("Exiting...");
                break;
            default:
                printf("Invalid choice! Please enter a number between 1 and 5.\n");
        }
    } while (choice != 5);

    return 0;
}

float areaOfRectangle(float length, float width) {
    return length * width;
}


float areaOfSquare(float side) {
    return side * side;
}

float areaOfCircle(float radius) {
    return PI * radius * radius;
}

float areaOfTriangle(float base, float height) {
    return 0.5 * base * height;
}

/*
Output:
***** MENU *****
1. Area of Rectangle
2. Area of Square
3. Area of Circle
4. Area of Triangle
5. Exit
Enter your choice: 1
Enter length and width of rectangle: 12 14
Area of Rectangle: 168.00


***** MENU *****
1. Area of Rectangle
2. Area of Square
3. Area of Circle
4. Area of Triangle
5. Exit
Enter your choice: 5
Exiting...

*/