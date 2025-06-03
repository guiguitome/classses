package br.com.guilherme.poo.carro;

public class Carro {
	String placa;
	String modelo;
	int ano;
	
	void exibirInfo() {
		System.out.println("O carro " + modelo + " da placa " + placa + " e ano " + ano);
	}
}
