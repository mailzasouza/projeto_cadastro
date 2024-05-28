package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do dolar hoje: R$");
		double dolar = sc.nextDouble();
		System.out.print("Quantos dolares serão comprados? ");
		double dolares = sc.nextDouble();
		
		Double taxa = 0.06;
		Double pagar = dolar * dolares;
		Double iof = pagar * taxa ;
		pagar = iof + pagar;
		
		System.out.println("Valor a pagar em Reais: R$" + pagar);
		
		sc.close();
	
	}

}
