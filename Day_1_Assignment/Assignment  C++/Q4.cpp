/*Write a C program to read the age of a candidate and determine whether it is eligible for casting his/her own vote.*/
#include<stdio.h>
int main() 
{
    int year;
    printf("Enter a year: ");
    scanf("%d", &year);
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	 {
        printf("%d is a leap year.\n", year);
    } else {
        printf("%d is not a leap year.\n", year);
    }
    return 0;
}

/* Output: Enter a year: 1992
1992 is a leap year. */