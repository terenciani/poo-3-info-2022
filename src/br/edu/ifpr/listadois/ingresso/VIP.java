package br.edu.ifpr.listadois.ingresso;

public class VIP extends Ingresso {
	private double valorAdicional;
	
	public VIP() {
		super();
	}

	public VIP(double valor,double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
   
}
