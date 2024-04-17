/*
1.Write a Java program that compares two wrapper objects for equality and demonstrates when to use equals() instead of == (try with Integer or Float classes)
*/
package assignment4;
public class WrapperComparison {
    public static void main(String[] args) {
        // Integer Example
        Integer int1 = 100;
        Integer int2 = 100;
        Integer int3 = new Integer(100);
        System.out.println("Integer Example:");
        System.out.println("Using == : " + (int1 == int2));
        System.out.println("Using equals(): " + int1.equals(int2));
        System.out.println("Using == with new Integer(): " + (int1 == int3));
        System.out.println("Using equals() with new Integer(): " + int1.equals(int3));
        Float float1 = 3.14f;
        Float float2 = 3.14f;
        Float float3 = new Float(3.14);
        System.out.println("\nFloat Example:");
        System.out.println("Using == : " + (float1 == float2));
        System.out.println("Using equals(): " + float1.equals(float2)); 
        System.out.println("Using == with new Float(): " + (float1 == float3));
        System.out.println("Using equals() with new Float(): " + float1.equals(float3));
    }
}

/*
Output:
Integer Example:
Using == : true
Using equals(): true
Using == with new Integer(): false
Using equals() with new Integer(): true

Float Example:
Using == : false
Using equals(): true
Using == with new Float(): false
Using equals() with new Float(): true
*/