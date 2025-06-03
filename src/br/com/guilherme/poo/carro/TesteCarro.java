package br.com.guilherme.poo.carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.ano = 2000;
		van.placa = "OHX-2466";
		van.modelo = "Topique";
				
		van.exibirInfo();
	}

}
