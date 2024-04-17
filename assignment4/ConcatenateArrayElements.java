/*
3.Write a Java program to concatenate all elements of a string array efficiently using StringBuilder.
*/
package assignment4;
public class ConcatenateArrayElements {
    public static void main(String[] args) {
        String[] array = {"This ", "is ", "a ", "string ", "array "};
        String result = concatenateArrayElements(array);
        System.out.println("Concatenated String: \n" + result);
    }
    public static String concatenateArrayElements(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (String element : array) {
            stringBuilder.append(element);
        }
        
        return stringBuilder.toString();
    }
}
/*
Output:
Concatenated String: 
This is a string array 
*/