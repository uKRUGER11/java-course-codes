package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Method reference
		list.removeIf(Product::staticProductPredicate);
		for (Product p : list) {
			System.out.println(p);
		}
	}
}