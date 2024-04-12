package javaassignment3;

public class Q9ShoppingCartTester {
	    public static void main(String[] args) {
	    	Q9ShoppingCart cart = new Q9ShoppingCart();
	    	Q9 product1 = new Q9(123456, "Laptop", 1000.00);
	    	Q9 product2 = new Q9(678901, "Monitor", 500.00);
	    	Q9 product3 = new Q9(234567, "Keyboard", 150.00);

	        cart.addProduct(product1);
	        cart.addProduct(product2);
	        cart.addProduct(product3);

	        cart.displayCartContents();

	        cart.removeProduct(678901);

	        cart.displayCartContents();

	        System.out.println("Total Cost: " + cart.calculateTotalCost());
	    }
	}
/*
 Shopping Cart Contents:
Product Id: 123456
Product Name: Laptop
Price: 1000.0
--------------------
Product Id: 678901
Product Name: Monitor
Price: 500.0
--------------------
Product Id: 234567
Product Name: Keyboard
Price: 150.0
--------------------
Total Cost: 1650.0
Shopping Cart Contents:
Product Id: 123456
Product Name: Laptop
Price: 1000.0
--------------------
Product Id: 234567
Product Name: Keyboard
Price: 150.0
--------------------
Total Cost: 1150.0
Total Cost: 1150.0
 */