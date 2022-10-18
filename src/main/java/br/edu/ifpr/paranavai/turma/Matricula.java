package br.edu.ifpr.paranavai.turma;

public class Matricula {
	String ra;
	String data;
	boolean situacao;

	public Matricula() {
	}

	public Matricula(String ra, String data) {
		this.ra = ra;
		this.data = data;
	}

	public Matricula(String ra, String data, boolean situacao) {
		super();
		this.ra = ra;
		this.data = data;
		this.situacao = situacao;
	}

}
