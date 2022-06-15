package br.edu.ifpr.palestra.aulaencapsulamento.teste;

import br.edu.ifpr.palestra.modelo.*;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		Palestra palestra = new Palestra();
		Palestrante palestrante = new Palestrante();
		Certificado certificado = new Certificado();
		Sala sala = new Sala();

		// n�o pode ser alterado por ser protegido
		// palestra.tema = "Testando";
		
		// palestrante.nome = "Marcelo"; // pode ser alterado por ser p�blico
		
		// n�o pode ser alterado por ser privado
		// certificado.numeroCertificado = 1;
		
		// n�o pode ser alterado por n�o estar no mesmo pacote
		// sala.capacidade = 40;
		
		
	}

}
