package operation;

import entity.Customer;
import entity.Product;
import service.Shop;

import java.util.HashMap;

public class ShopManagementSystem {
    public static void main(String[] args) {
        // Create a Shop object
        Shop shop = new Shop();

        // Add some products to the shop
        Product product1 = new Product("P001", "Shirt", 25.99, 100);
        Product product2 = new Product("P002", "Jeans", 35.99, 80);
        Product product3 = new Product("P003", "Shoes", 49.99, 50);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        // Add some customers to the shop
        Customer customer1 = new Customer("C001", "John Doe", "1234567890");
        Customer customer2 = new Customer("C002", "Jane Smith", "9876543210");
        shop.addCustomer(customer1);
        shop.addCustomer(customer2);

        // Search for a product by name
        String searchProductName = "Shirt";
        Product foundProduct = shop.searchProductByName(searchProductName);
        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct.getProductName());
        } else {
            System.out.println("Product not found with name: " + searchProductName);
        }

        // Search for products by price range
        double minPrice = 30.0;
        double maxPrice = 50.0;
        HashMap<String, Product> productsInRange = shop.searchProductByPriceRange(minPrice, maxPrice);
        System.out.println("Products in price range " + minPrice + " to " + maxPrice + ":");
        for (Product product : productsInRange.values()) {
            System.out.println("Product: " + product.getProductName() + ", Price: " + product.getPrice());
        }

        // Display all products and customers
        shop.displayAllProducts();
        shop.displayAllCustomers();
    }
}
