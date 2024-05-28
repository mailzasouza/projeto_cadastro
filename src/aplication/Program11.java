package aplication;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		
		int pares;
		
		int n = sc.nextInt();
		
		int [] number = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um número: ");
			number[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		pares = 0;
		for(int i = 0; i < n; i++) {
			if (number [i] % 2 == 0) {
				System.out.println(number[i]);
				pares++;
			}
		}
		
		System.out.println("QUANTIDADE DE NÚMEROS PARES = "+ pares);
		
		sc.close();
	}
		
	
}
		