package br.edu.ifpr.paranavai.turma;

public class Aluno {
	String nome;
	String cpf;
	String telefone;
	String endereco;
	String dataNascimento;

	public Aluno() {

	}

	Aluno(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Aluno(String nome, String cpf, String endereco, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}

}
