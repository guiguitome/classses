package br.com.guilherme.poo.aluno;

public class Aluno {
	String nome;
	int idade;
	Double altura;
	
	void exibirInfo() {
		System.out.println("O aluno " + nome + " de " + idade + " anos de idade e " + altura + " metros de altura");
	}
}
