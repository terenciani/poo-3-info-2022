package br.edu.ifpr.paranavai.palestra;

public class Palestrante {
	String nome;
	String cpf;
	String endereco;
	String rg;
	String dataNascimento;
	String cidadeNascimento;
	String estadoNascimento;
	
	public Palestrante() {
	}

	public Palestrante(String nome, String cpf, String endereco, String rg, String dataNascimento,
			String cidadeNascimento, String estadoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.estadoNascimento = estadoNascimento;
	}
}
