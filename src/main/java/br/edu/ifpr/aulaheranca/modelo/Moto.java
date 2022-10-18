package br.edu.ifpr.aulaheranca.modelo;

public class Moto extends VeiculoTerrestre{
	private int cilindradas;

	public Moto() {
		super();
	}

	public Moto(double preco, int anoFabricacao, double peso) {
		super(preco, anoFabricacao, peso);
		// TODO Auto-generated constructor stub
	}

	public Moto(int cilindradas) {
		super();
		this.cilindradas = cilindradas;
	}
	
	public Moto(String placa, int renavam) {
		super(placa, renavam);
		// TODO Auto-generated constructor stub
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	

}
