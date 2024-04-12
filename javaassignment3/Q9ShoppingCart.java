package javaassignment3;
import java.util.ArrayList;
public class Q9ShoppingCart {
	    private ArrayList<Q9> products;

	    public Q9ShoppingCart() {
	        products = new ArrayList<>();
	    }

	    public void addProduct(Q9 product) {
	        products.add(product);
	    }

	    public void removeProduct(int productId) {
	        for (int i = 0; i < products.size(); i++) {
	            if (products.get(i).getProductId() == productId) {
	                products.remove(i);
	                return;
	            }
	        }
	        System.out.println("No product with id " + productId + " found.");
	    }

	    public double calculateTotalCost() {
	        double totalCost = 0.0;
	        for (Q9 product : products) {
	            totalCost += product.getPrice();
	        }
	        return totalCost;
	    }

	    public void displayCartContents() {
	        System.out.println("Shopping Cart Contents:");
	        for (Q9 product : products) {
	            System.out.println("Product Id: " + product.getProductId());
	            System.out.println("Product Name: " + product.getProductName());
	            System.out.println("Price: " + product.getPrice());
	            System.out.println("--------------------");
	        }
	        System.out.println("Total Cost: " + calculateTotalCost());
	    }
	}
