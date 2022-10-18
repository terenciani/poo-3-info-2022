package br.edu.ifpr.aulaheranca.modelo;

public class Lancha extends VeiculoAquatico {
	private int capacidadeMaximaDePessoas;

	public Lancha() {
		super();
	}

	public Lancha(double preco, int anoFabricacao, double peso) {
		super(preco, anoFabricacao, peso);
		// TODO Auto-generated constructor stub
	}

	public Lancha(int capacidadeMaximaDePessoas) {
		super();
		this.capacidadeMaximaDePessoas = capacidadeMaximaDePessoas;
	}

	public int getCapacidadeMaximaDePessoas() {
		return capacidadeMaximaDePessoas;
	}

	public void setCapacidadeMaximaDePessoas(int capacidadeMaximaDePessoas) {
		this.capacidadeMaximaDePessoas = capacidadeMaximaDePessoas;
	}
	
	

}
