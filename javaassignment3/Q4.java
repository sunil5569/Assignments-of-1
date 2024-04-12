/*
 4. Create a class called Matrix containing constructor that initializes the number
of rows and number of columns of a new Matrix object. The Matrix class has the
following information:
a. number of rows of matrix
b. number of columns of matrix
c. elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
a. get the number of rows
b. get the number of columns
c. set the elements of the matrix at given position (i,j)
d. adding two matrices. If the matrices are not addable Matrices cannot be will be displayed.
*/
package javaassignment3;

public class Q4 {
	    private int rows;
	    private int columns;
	    private int[][] elements;

	    // Constructor to initialize the number of rows and columns of the matrix
	    public Q4(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        this.elements = new int[rows][columns];
	    }
	    public int getRows() {
	        return rows;
	    }
	    public int getColumns() {
	        return columns;
	    }
	    public void setElement(int i, int j, int value) {
	        if (i >= 0 && i < rows && j >= 0 && j < columns) {
	            elements[i][j] = value;
	        } else {
	            System.out.println("Invalid position to set element.");
	        }
	    }
	    public static Q4 addMatrices(Q4 matrix1, Q4 matrix2) {
	        if (matrix1.rows == matrix2.rows && matrix1.columns == matrix2.columns) {
	        	Q4 result = new Q4(matrix1.rows, matrix1.columns);
	            for (int i = 0; i < matrix1.rows; i++) {
	                for (int j = 0; j < matrix1.columns; j++) {
	                    result.elements[i][j] = matrix1.elements[i][j] + matrix2.elements[i][j];
	                }
	            }
	            return result;
	        } else {
	            System.out.println("Matrices cannot be added.");
	            return null;
	        }
	    }
	    public void displayMatrix() {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(elements[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	    	Q4 matrix1 = new Q4(2, 2);
	        matrix1.setElement(0, 0, 1);
	        matrix1.setElement(0, 1, 2);
	        matrix1.setElement(1, 0, 3);
	        matrix1.setElement(1, 1, 4);

	        Q4 matrix2 = new Q4(2, 2);
	        matrix2.setElement(0, 0, 5);
	        matrix2.setElement(0, 1, 6);
	        matrix2.setElement(1, 0, 7);
	        matrix2.setElement(1, 1, 8);

	        System.out.println("Matrix 1:");
	        matrix1.displayMatrix();
	        System.out.println("Matrix 2:");
	        matrix2.displayMatrix();

	        System.out.println("Adding Matrix 1 and Matrix 2:");
	        Q4 sumMatrix = Q4.addMatrices(matrix1, matrix2);
	        if (sumMatrix != null) {
	            sumMatrix.displayMatrix();
	        }
	    }
	}
/*
Output:
Matrix 1:
1 2 
3 4 
Matrix 2:
5 6 
7 8 
Adding Matrix 1 and Matrix 2:
6 8 
10 12 */