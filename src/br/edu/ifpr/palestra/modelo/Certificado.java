package br.edu.ifpr.palestra.modelo;

public class Certificado {
	private int livro;
	private int pagina;
	private int numeroCertificado;
	private int folha;
	
	public Certificado() {
		
	}
	
	public Certificado(int livro, int pagina, int numeroCertificado, int folha) {
		this.livro = livro;
		this.pagina = pagina;
		this.numeroCertificado = numeroCertificado;
		this.folha = folha;
	}
}
