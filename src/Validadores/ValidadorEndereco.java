package Validadores;

import entities.Endereco;

public class ValidadorEndereco {
	private static void validarCep(String cep) {
		if (cep.length() < 9) {
			throw new RuntimeException("Cep Invalido");
		}
	}

	protected static void validarEndereco(Endereco endereco) {
		validarCep(endereco.getCep());
	}
}
