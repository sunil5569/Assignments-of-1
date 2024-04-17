package assignment4;

/*
2.Write a Java program to remove duplicate characters from a string using StringBuffer.
*/

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello world";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean[] found = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!found[currentChar]) {
                found[currentChar] = true;
                stringBuffer.append(currentChar);
            }
        }

        return stringBuffer.toString();
    }
}

/*
Original String: hello world
String after removing duplicates: helo wrd
*/