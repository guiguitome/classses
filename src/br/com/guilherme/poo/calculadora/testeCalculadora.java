package br.com.guilherme.poo.calculadora;

public class testeCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Calculadora.tipo = "cientifica";
		Calculadora.tamanho = 12;
		Calculadora.bits = 16;
		
		calculadora.exibirInfo();
	}

}
