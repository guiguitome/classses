package br.com.guilherme.poo.lampada;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada led = new Lampada();
		led.cor = "branca";
		led.tipo = "LED";
		led.voltagem = 220;
		
		led.exibirInfo();
	}

}
