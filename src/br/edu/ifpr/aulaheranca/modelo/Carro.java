package br.edu.ifpr.aulaheranca.modelo;

public class Carro extends VeiculoTerrestre {
	private int numeroDePortas;

	public Carro() {
		super();
	}

	public Carro(int numeroDePortas) {
		super();
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	

}
