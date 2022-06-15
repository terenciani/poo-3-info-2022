package br.edu.ifpr.aulaheranca.modelo;

public class Veiculo {
	private double preco;
	private int anoFabricacao;
	private double peso;
	
	
	
	public Veiculo() {
		super();
	}

	public Veiculo(double preco, int anoFabricacao, double peso) {
		super();
		this.preco = preco;
		this.anoFabricacao = anoFabricacao;
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


}
