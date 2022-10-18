package br.edu.ifpr.palestra.modelo;

public class Sala {
	private int capacidade;
	private String nome;
	private String local;

	public Sala() {
	
	}

	public Sala(int capacidade, String nome, String local) {
		this.capacidade = capacidade;
		this.nome = nome;
		this.local = local;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}