package entities;

public abstract class Product {
	
	private int id;
	private String name;
	private int stock;
	private double unitPrice;
	
	public Product(int id, String name, int stock, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public void addStock(int quantity) {
		stock += quantity;
	}
	
	public void removeStock(int quantity) {
		if (quantity <= stock) {
			stock -= quantity;
		} else {
			System.out.println("unavailable stock!");
		}
	}
}
