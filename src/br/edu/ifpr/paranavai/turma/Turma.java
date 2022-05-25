package br.edu.ifpr.paranavai.turma;

public class Turma {
	int numeroMinimo;
	String nome;
	int anoIngresso;
	int qtdAnosNoIF;

	// metodos
	public Turma() {

	}

	public Turma(int numeroMinimo, String nome, int anoIngresso) {
		this.numeroMinimo = numeroMinimo;
		this.nome = nome;
		this.anoIngresso = anoIngresso;
		this.qtdAnosNoIF = 2022 - this.anoIngresso;
	}

	int obterQtdMatriculas() {
		return 0;
	}
}
