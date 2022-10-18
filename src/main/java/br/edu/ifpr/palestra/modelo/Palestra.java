package br.edu.ifpr.palestra.modelo;

public class Palestra {
	private  String tema;
	private  String diaHora;
	private  boolean exigeFrequencia;

	public Palestra() {
		
	}

	public Palestra(String tema, String diaHora, boolean exigeFrequencia) {
		this.tema = tema;
		this.diaHora = diaHora;
		this.exigeFrequencia = exigeFrequencia;
	}

}
