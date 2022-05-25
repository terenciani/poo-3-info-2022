package br.edu.ifpr.palestra.modelo;

public class Palestrante {
	private  String nome;
	private  String cpf;
	private  String endereco;
	private  String rg;
	private  String dataNascimento;
	private  String cidadeNascimento;
	private  String estadoNascimento;
	
	public Palestrante() {
	}
	
	public Palestrante(String nome) {
		this.nome = nome;
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
	
	public String getNome() {
		return this.nome.toLowerCase();
	}
}
