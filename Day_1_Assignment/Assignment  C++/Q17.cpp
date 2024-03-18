/* Write a C program to check whether an alphabet is a vowel or consonant. */
#include <stdio.h>
#include <ctype.h>
int main() {
    char ch;
    printf("Enter an alphabet: ");
    scanf(" %c", &ch);
    ch = tolower(ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        printf("%c is a vowel.\n", ch);
    else
        printf("%c is a consonant.\n", ch);

    return 0;
}
/*Output:
1)
Enter an alphabet: i
i is a vowel.
2)
Enter an alphabet: p
p is a consonant.
 */