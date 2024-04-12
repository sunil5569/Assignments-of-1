/*
 9. Design classes ShoppingCart and Product. ShoppingCart class that contains an Array of Product objects.
Implement methods to add products to the cart, calculate the total cost, and display the contents of the cart.
(Decide the data members and methods of the classes Effectively)
*/
package javaassignment3;

public class Q9 { //Q9=Product
	
	    private int productId;
	    private String productName;
	    private double price;
	    public Q9(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public double getPrice() {
	        return price;
	    }
	}
