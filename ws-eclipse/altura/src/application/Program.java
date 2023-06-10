package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people will be typed? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Person data " + (i + 1) + " :");
			System.out.print("Name: ");
			names[i] = sc.next();
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			System.out.print("Height: ");
			heights[i] = sc.nextDouble();	
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum = sum + heights[i];
		}
		
		double averageHeights = sum / n;
		
		System.out.println();
		System.out.printf("AVERAGE HEIGHT: %.2f%n", averageHeights);
		
		int count = 0;
		for (int i=0; i<n; i++) {
			if (ages[i] < 16) {
				count = count + 1;
			}
		}
		
		double percentage = count * 100.0 / n;
		System.out.printf("People under 16 years old: %.1f%%%n", percentage);
		
		for (int i=0; i<n; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
	}

}
