package entities;

public class Drink extends Product {
	
	private String type;

	public Drink(int id, String name, int stock, double unitPrice, String type) {
		super(id, name, stock, unitPrice);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
