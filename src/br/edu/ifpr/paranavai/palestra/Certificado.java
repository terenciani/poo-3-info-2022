package br.edu.ifpr.paranavai.palestra;

public class Certificado {
	int livro;
	int pagina;
	int numeroCertificado;
	int folha;
	
	public Certificado() {
		
	}
	
	public Certificado(int livro, int pagina, int numeroCertificado, int folha) {
		this.livro = livro;
		this.pagina = pagina;
		this.numeroCertificado = numeroCertificado;
		this.folha = folha;
	}
}
