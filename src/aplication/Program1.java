package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program1 {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
			
		System.out.println("Nome:  ");
			emp.nome = sc.nextLine();
		System.out.println("Salário bruto: ");	
			emp.salarioBruto = sc.nextDouble();
		System.out.println("Taxa: ");	
			emp.taxa = sc.nextDouble();
		
			System.out.print("Funcionário: " + emp);
			System.out.println();
			System.out.print("Qual o percentual para aumento do salário: ");
			double porcentagem = sc.nextDouble();
			emp.percentualAumentoSalario(porcentagem);
			System.out.println("Dados atualizados: "+ emp );
			
			
		sc.close();	
	}

}
