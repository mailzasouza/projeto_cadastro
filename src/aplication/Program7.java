package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n;
				
		System.out.print("Quantos números você vai digitar? ");
		
		n = sc.nextInt();
		double [] vet = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
			
		}
		
		System.out.print("VALORES = " );
		for (int i = 0; i < n; i++) {
			if (vet[i] >= 0) {
				System.out.printf("%.1f  ", vet[i]);
		}
			}
		System.out.println();
		double sum;	
		sum = 0;
		for (int i = 0; i < n; i++)
		sum += vet[i];
		System.out.println("SOMA = " + sum);
		
		double media = sum / n;
		System.out.println("MEDIA = " + media);
		
		
		sc.close();
	}

}
