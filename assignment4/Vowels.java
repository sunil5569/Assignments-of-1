/*
8.Write a JAVA program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
*/
package assignment4;
import java.util.Arrays;
public class Vowels {
    public static void main(String[] args) {
        String input = "bcdfghjkl";
        try {
            validateStringWithVowels(input);
            System.out.println("The string contains vowels.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateStringWithVowels(String input) throws Exception {
        String vowels = "aeiouAEIOU";
        boolean isValid = false;
        for (char c : input.toCharArray()) {
            if (Arrays.asList(vowels.toCharArray()).contains(c)) {
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            throw new Exception("The string does not contain any vowels.");
        }
    }
}

/*
Output:
The string does not contain any vowels.
*/