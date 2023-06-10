package entities;

public class Magazine extends Product {
	
	private String publisher;

	public Magazine(int id, String name, int stock, double unitPrice, String publisher) {
		super(id, name, stock, unitPrice);
		this.setPublisher(publisher);
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}	
}
