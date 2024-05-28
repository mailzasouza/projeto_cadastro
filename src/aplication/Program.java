package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle1 = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth: ");
		System.out.println("Width: ");
		rectangle1.width = sc.nextDouble();
		System.out.println("Heigth: ");
		rectangle1.heigth =sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n ", rectangle1.area());
		
		System.out.printf("PERIMETRO = %.2f%n ", rectangle1.perimeter());
		
		System.out.printf("DIAGONAL = %.2f%n ", rectangle1.diagonal());
		
	
		
		
		
		sc.close();

	}

}
