package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> list = new HashSet<>();
		
		list.add(1);
		list.add(2);
		list.add(null);
		list.add(null);
		list.add(3);
			
		print(list);
		
		sc.close();
	}
	
	private static void print(Set<Integer> items) {
		Iterator<Integer> iterator = items.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
