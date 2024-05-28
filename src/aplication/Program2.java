package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Trimestre 1: ");
		aluno.trimestre1 = sc.nextDouble();
		System.out.print("Trimestre 2: ");
		aluno.trimestre2 = sc.nextDouble();
		System.out.print("Trimestre 3: ");
		aluno.trimestre3 = sc.nextDouble();
		
		System.out.printf("Total das notas: %.2f%n " , aluno.notaFinal());
		if (aluno.notaFinal() < 60) {
			System.out.println("REPROVADO");
			System.out.print("RECUPERE "+ aluno.missingPoints() + " PONTOS" );
	}
		else 
			System.out.println("APROVADO");
		
		sc.close();
			

	}

}
