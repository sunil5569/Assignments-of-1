/*3.Write a C program to check whether a given number is positive or negative.*/
#include <stdio.h>
int main() 
{
    int number;
    printf("Enter an integer: ");
    scanf("%d", &number);
    if (number > 0) {
        printf("%d is a positive number.\n", number);
    } else if (number < 0) {
        printf("%d is a negative number.\n", number);
    } else {
        printf("You entered zero.\n");
    }

    return 0;
}

Output:
	/*Enter an integer: -5
    -5 is a negative number.*/