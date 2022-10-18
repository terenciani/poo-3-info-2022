package br.edu.ifpr.aulaheranca.modelo;

public class JetSki extends VeiculoAquatico{
	private int cilindradas;

	public JetSki() {
		super();
	}

	
	public JetSki(double preco, int anoFabricacao, double peso) {
		super(preco, anoFabricacao, peso);
		// TODO Auto-generated constructor stub
	}


	public JetSki(int cilindradas) {
		super();
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	

}
