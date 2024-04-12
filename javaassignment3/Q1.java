/*1.Write a program to print the area and perimeter of a triangle having sides of
3, 4 and 5 units by creating a class named Triangle with parameter in its constructor.
*/

package javaassignment3;
public class Q1 {
	    private double side1;
	    private double side2;
	    private double side3;
	    public Q1(double side1, double side2, double side3) 
	    {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }
	    public double perimeter()
	    {
	        return side1 + side2 + side3;
	    }

	    public double area() {
	        double s = perimeter() / 2;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }
	    public static void main(String[] args) {
	    	Q1 triangle = new Q1(3, 4, 5);
	        System.out.println("Perimeter of the triangle: " + triangle.perimeter());
	        System.out.println("Area of the triangle: " + triangle.area());
	    }
	}

/*Output:
 Perimeter of the triangle: 12.0
Area of the triangle: 6.0
 */