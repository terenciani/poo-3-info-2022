package br.edu.ifpr.aulaheranca.modelo;

public class VeiculoAquatico extends Veiculo{
	private int numeroDeRegistro;

	public VeiculoAquatico() {
		
	}
	
	
	public VeiculoAquatico(double preco, int anoFabricacao, double peso) {
		super(preco, anoFabricacao, peso);
		// TODO Auto-generated constructor stub
	}


	public VeiculoAquatico(int numeroDeRegistro) {
		super();
		this.numeroDeRegistro = numeroDeRegistro;
	}
	public int getNumeroDeRegistro() {
		return numeroDeRegistro;
	}
	public void setNumeroDeRegistro(int numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}
	
	
}
