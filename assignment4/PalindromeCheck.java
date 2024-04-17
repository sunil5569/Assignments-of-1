/*
4.Write a Java method to check if an input string is a palindrome (Use String functions).
*/
package assignment4;
public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "radar";
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        String formattedStr = str.replaceAll("\\s+", "").toLowerCase();
        return formattedStr.equals(new StringBuilder(formattedStr).reverse().toString());
    }
}


/*
Output:
radar is a palindrome.
*/
