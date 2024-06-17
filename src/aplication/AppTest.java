package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Validadores.ValidadorPessoa;
import entities.Endereco;
import entities.Pessoa;

public class AppTest {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> listaDePessoa = new ArrayList<>();
		// Cadastro de pessoas

		// Menu para cadastrar, exibir todos os usuarios, buscar usuario especifico por
		// cpf e deletar usuario.

		Pessoa pessoa = CadastrarUsuario(sc);

		listaDePessoa.add(pessoa);
		System.out.println("Finalizou");
		sc.close();
	}

	private static Pessoa CadastrarUsuario(Scanner sc) {

		// Pedir informações do usuario e preencher seus dados (Scanner 'SC')
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();

		System.out.print("Digite o nome do candidato: ");
		String nome = sc.nextLine();
		
		pessoa.setNome(nome);

		while (pessoa.getSenha() == null) {
			System.out.print("Digite a senha: ");
			String senha = sc.nextLine();
			if (ValidadorPessoa.validarSenha(senha)) {
				pessoa.setSenha(senha);
			}
		}

		while (pessoa.getCpf() == null) {
			System.out.print("Digite o cpf: ");
			String cpf = sc.nextLine();
			if (ValidadorPessoa.validarCpf(cpf)) {
				pessoa.setCpf(cpf);
			}
		}

		do {
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			sc.nextLine();

			pessoa.setIdade(idade);
		} while (!ValidadorPessoa.validarIdade(pessoa.getIdade()));

		do {
			System.out.print("Digite o email: ");
			pessoa.setEmail(sc.nextLine());
			if (!ValidadorPessoa.validarEmail(pessoa)) {
				System.out.println("Email invalido. Digite novamente: ");
			}
		} while (!ValidadorPessoa.validarEmail(pessoa));

		while(pessoa.getAltura()< 1.80) {
		System.out.print("Digite a altura: ");
		pessoa.setAltura(sc.nextDouble());
		sc.nextLine();
		if (ValidadorPessoa.validarAltura(pessoa)) {
			double altura = 18;
			pessoa.setAltura(altura);
		}
		
		
		System.out.print("Digite o Bairro: ");
		endereco.setBairro(sc.nextLine());
		System.out.print("Digite o nome da Rua: ");
		endereco.setRua(sc.nextLine());
		System.out.print("Digite o nome da cidade: ");
		endereco.setCidade(sc.nextLine());
		System.out.print("Digite o cep: ");
		endereco.setCep(sc.nextLine());
		System.out.print("Digite o número: ");
		endereco.setNumero(sc.nextInt());

		pessoa.setEndereco(endereco);

		ValidadorPessoa.validarDadosPessoa(pessoa);
		return pessoa;

		}
		sc.close();
}
}
	

