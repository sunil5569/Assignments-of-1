/*Write a C program to accept the height of a person in centimeter and categorize the person according to their height.*/
#include <stdio.h>
int main() 
{
    float height;
    printf("Enter the height of the person in centimeters: ");
    scanf("%f", &height);
    if (height < 150) {
        printf("The person is short.\n");
    } else if (height >= 150 && height < 180) 
	{
        printf("The person is of average height.\n");
    } else {
        printf("The person is tall.\n");
    }
    return 0;
}
/* Ouput:
Enter the height of the person in centimeters: 165
The person is of average height.
*/