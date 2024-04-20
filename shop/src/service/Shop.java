package service;

import entity.Customer;
import entity.Product;

import java.util.HashMap;

public class Shop {
    private HashMap<String, Product> products;
    private HashMap<String, Customer> customers;

    public Shop() {
        products = new HashMap<>();
        customers = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void removeProduct(String productId) {
        products.remove(productId);
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public void removeCustomer(String customerId) {
        customers.remove(customerId);
    }

    public Product searchProductByName(String productName) {
        for (Product product : products.values()) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public HashMap<String, Product> searchProductByPriceRange(double minPrice, double maxPrice) {
        HashMap<String, Product> productsInRange = new HashMap<>();
        for (Product product : products.values()) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                productsInRange.put(product.getProductId(), product);
            }
        }
        return productsInRange;
    }

    public void displayAllProducts() {
        System.out.println("All Products:");
        for (Product product : products.values()) {
            System.out.println("Product ID: " + product.getProductId() +
                               ", Name: " + product.getProductName() +
                               ", Price: " + product.getPrice() +
                               ", Quantity Available: " + product.getQuantityAvailable());
        }
    }

    public void displayAllCustomers() {
        System.out.println("All Customers:");
        for (Customer customer : customers.values()) {
            System.out.println("Customer ID: " + customer.getCustomerId() +
                               ", Name: " + customer.getCustomerName() +
                               ", Contact Number: " + customer.getContactNumber());
        }
    }
}
