package br.com.guilherme.poo.lampada;

public class Lampada {
	String cor;
	String tipo;
	int voltagem;
	
	void exibirInfo() {
		System.out.println("A lampada " + tipo + " da cor " + cor + " é de " + voltagem + "volts");
	}
}
