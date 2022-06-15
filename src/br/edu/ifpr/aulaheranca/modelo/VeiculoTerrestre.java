package br.edu.ifpr.aulaheranca.modelo;

public class VeiculoTerrestre extends Veiculo{
	private String placa;
	private int renavam;
	
	
	public VeiculoTerrestre() {
		
	}
	
	public VeiculoTerrestre(String placa, int renavam) {
		super();
		this.placa = placa;
		this.renavam = renavam;
	}


	public VeiculoTerrestre(double preco, int anoFabricacao, double peso) {
		super(preco, anoFabricacao, peso);
		// TODO Auto-generated constructor stub
	}

	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getRenavam() {
		return renavam;
	}


	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}
	
	

}
