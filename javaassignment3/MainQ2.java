package javaassignment3;

public class MainQ2 {

  public static void main(String[] args) {

    // first complex number
	  MainQ2 c1 = new MainQ2();
	  MainQ2 c2 = new MainQ2();

	  MainQ2 sum = c1.sum(c2);
	  MainQ2 difference = c1.difference(c2);

    System.out.println("first complex number: " + c1);
    System.out.println("second complex number: " + c2);
    System.out.println("sum of two complex numbers: " + sum);
    System.out.println("difference of two complex numbers: " + difference);

  }

private MainQ2 difference(MainQ2 c2) {
	// TODO Auto-generated method stub
	return null;
}

private MainQ2 sum(MainQ2 c2) {
	// TODO Auto-generated method stub
	return null;
}
}
/*
Output:
Enter the real part of the first complex number:
5
Enter the imaginary part of the first complex number:
5
Enter the real part of the second complex number:
5
Enter the imaginary part of the second complex number:
5
Sum of the two complex numbers: 10.0 + 10.0i
Difference of the two complex numbers: 0.0 + 0.0i
Product of the two complex numbers: 0.0 + 50.0i
*/
