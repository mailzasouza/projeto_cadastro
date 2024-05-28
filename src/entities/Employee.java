package entities;

public class Employee {
	
	//atributos
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	//métodos
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	public double percentualAumentoSalario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem / 100;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f" , salarioLiquido());
	}
	
	
	
	
}
