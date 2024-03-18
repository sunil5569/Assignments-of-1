/* Write a C program to check whether a character is an alphabet, digit or special character. */
#include <stdio.h>
#include <ctype.h>
int main() {
    char ch;
    printf("Enter a character: ");
    scanf("%c", &ch);
    if (isalpha(ch))
        printf("%c is an alphabet.\n", ch);
    else if (isdigit(ch))
        printf("%c is a digit.\n", ch);
    else
        printf("%c is a special character.\n", ch);

    return 0;
}
/* Output:
Enter a character: sunil 5569
s is an alphabet.
*/