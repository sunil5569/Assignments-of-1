/* Write a C program to read temperature in centigrade and display a suitable message according to temperature state below: */
#include <stdio.h>
int main() {
    float temperature;
    printf("Enter the temperature in centigrade: ");
    scanf("%f", &temperature);
    if (temperature < 0)
        printf("Freezing weather\n");
    else if (temperature >= 0 && temperature <= 10)
        printf("Very Cold weather\n");
    else if (temperature > 10 && temperature <= 20)
        printf("Cold weather\n");
    else if (temperature > 20 && temperature <= 30)
        printf("Normal in Temp\n");
    else if (temperature > 30 && temperature <= 40)
        printf("It's Hot\n");
    else
        printf("It's Very Hot\n");

    return 0;
}

/* Output:
Enter the temperature in centigrade: 33.00
It's Hot */