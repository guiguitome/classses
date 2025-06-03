package br.com.guilherme.poo.calculadora;

public class Calculadora {
	String tipo;
	Double tamanho;
	int bits;
	
	void exibirInfo() {
		System.out.println("A calculador " + tipo + " com tamanha de " + tamanho + " centimetros e " + bits + "bits");
	}
}
