package entities;

public class Candy extends Product {
	
	private String brand;

	public Candy(int id, String name, int stock, double unitPrice, String brand) {
		super(id, name, stock, unitPrice);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
