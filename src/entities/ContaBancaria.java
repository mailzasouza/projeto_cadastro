package entities;

public class ContaBancaria {
	
	//atributos
	private String name;
	private int numero;
	private double valor;
	
	
	//métodos
	public ContaBancaria(String name, int numero) {
		this.name = name;
		this.numero = numero;
	}
	public ContaBancaria(String name, int numero, double initialDeposit) {
		this.name = name;
		this.numero = numero;
		deposit(initialDeposit);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumero() {
		return numero;
	}
	public double getValor() {
		return valor;
	}
	public void deposit(double amount) {
		valor += amount;
	}
	public void saque(double amount) {
		valor -= amount + 5.0;
	}
	
	public String toString() {
		return "ContaBancaria "
				+ numero
				+ ", Nome: "
				+ name
				+ ", valor: $ "
				+ String.format("%.2f", valor);
	}
}

	