package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;



public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaBancaria;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit(y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit Value: ");	
			double initialDeposit = sc.nextDouble();
			contaBancaria = new ContaBancaria(name, numero, initialDeposit);
		}
		else
			contaBancaria = new ContaBancaria(name, numero);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
			double depositValor = sc.nextDouble();
			contaBancaria.deposit(depositValor);
		
			System.out.print("Update account data: ");
			System.out.println();
			System.out.println(contaBancaria);	
			
		System.out.println();	
		System.out.print("Enter a withdraw value: ");	
			double saque = sc.nextDouble();
			
			contaBancaria.saque(saque);
			System.out.print("Update account data: ");
			System.out.println();
			
			System.out.println(contaBancaria);	
			
		
			
		
		
		sc.close();
	}
		
		
}

