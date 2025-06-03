package br.com.guilherme.poo.aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno Lucas = new Aluno();
		Lucas.nome = "Lucas";
		Lucas.idade = 19;
		Lucas.altura = 1.74;
		
		Lucas.exibirInfo();
	}

}
