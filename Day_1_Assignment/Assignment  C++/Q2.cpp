/* Write a C program to check whether a given number is even or odd. */
#include <stdio.h>
        int main()
{
        
	    int number;
        printf("Enter an integer: ");
        scanf("%d", &number);
        if (number % 2 == 0) 
{
        printf("%d is an even number.\n", number);
}      else 
{
        printf("%d is an odd number.\n", number);
}
       return 0;
}

/* Output:
Enter an integer: 5
5 is an odd number. */