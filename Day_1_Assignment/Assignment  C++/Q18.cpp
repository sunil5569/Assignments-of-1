/*Write a program in C to calculate and print the Electricity bill of a given customer. 
	The customer id., name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer. */
	#include <stdio.h>
int main() {
    int customerId, units;
    char customerName[50];
    float totalAmount;
    printf("Enter Customer ID: ");
    scanf("%d", &customerId);
    printf("Enter Customer Name: ");
    scanf("%s", customerName);
    printf("Enter units consumed: ");
    scanf("%d", &units);
    if (units <= 50)
        totalAmount = units * 0.50;
    else if (units <= 150)
        totalAmount = 25 + (units - 50) * 0.75;
    else if (units <= 250)
        totalAmount = 100 + (units - 150) * 1.20;
    else
        totalAmount = 220 + (units - 250) * 1.50;
    if (totalAmount > 400)
        totalAmount *= 1.15; // 15% surcharge
    printf("\nCustomer ID: %d\n", customerId);
    printf("Customer Name: %s\n", customerName);
    printf("Units Consumed: %d\n", units);
    printf("Total Amount to Pay: %.2f\n", totalAmount);
    return 0;
}
/*
Output:
Enter Customer ID: 5569
Enter Customer Name: sunil
Enter units consumed: 12

Customer ID: 5569
Customer Name: sunil
Units Consumed: 12
Total Amount to Pay: 6.00
*/