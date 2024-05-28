package Validadores;

import entities.Pessoa;

public class ValidadorPessoa {
	
	
	public static void validarNome(String nome) {
		if (nome == null){
			System.out.println("Nome inválido");
			
		}
	}

	public static boolean validarSenha(String senha) {
		if (senha.length() < 8) {
			System.out.println("Senha deve ter mais de 8 caracteres");
			return false;
		}

		if (senha.contains("123")) {
			System.out.println("Não pode ter numeros sequenciais");
			return false;
		}
		return true;
	}

	public static boolean validarCpf(String cpf) {
		if (cpf.length() < 11) {
			System.out.println("CPF invalido");
			return false;
		}
		return true;
	}

	public static boolean validarIdade(int idade) {
		if (idade < 18) {
			System.out.println("A pessoa deve ter mais de 18 anos");
			return false;
		}
		return true;
	}

	public static boolean validarEmail(Pessoa pessoa) {
		if (!pessoa.getEmail().contains("@")) {
			System.out.println("Email inválido, digite novamente: ");
			return false;
		}	
		return true;
	}
	
	private static void validarAltura(Pessoa pessoa) {
		if (pessoa.getAltura() < 1.80) {
			throw new RuntimeException("O candidato não tem altura o suficiente ");
		}
	}
	

	public static void validarDadosPessoa(Pessoa pessoa) {
		validarEmail(pessoa);
		validarAltura(pessoa);
		ValidadorEndereco.validarEndereco(pessoa.getEndereco());;
	}

}
