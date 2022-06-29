package br.edu.ifpr.listadois.ingresso;

public class Ingresso {
	private double valor;

	public Ingresso(double valor) {
		super();
		this.valor = valor;
	}

	public Ingresso() {
		super();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
      public void imprimeValor() {
    	  System.out.println("O valor é: R$ "+ this.getValor());
    	  
      }
}
