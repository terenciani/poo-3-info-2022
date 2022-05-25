package br.edu.ifpr.paranavai.palestra;

public class Palestra {
	String tema;
	String diaHora;
	boolean exigeFrequencia;

	public Palestra() {
		
	}

	public Palestra(String tema, String diaHora, boolean exigeFrequencia) {
		this.tema = tema;
		this.diaHora = diaHora;
		this.exigeFrequencia = exigeFrequencia;
	}

}
