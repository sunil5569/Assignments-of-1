package entity;

public class Product {
	private String productId;
	private String productName;
	private double price;
	private int quantityAvailable;

	// Constructor
	public Product(String productId, String productName, double price, int quantityAvailable) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
	}

	// Getter and setter methods
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
}
