package br.edu.ifpr.palestra.aulaencapsulamento.teste;

import br.edu.ifpr.palestra.modelo.Certificado;
import br.edu.ifpr.palestra.modelo.Palestra;
import br.edu.ifpr.palestra.modelo.Palestrante;
import br.edu.ifpr.palestra.modelo.Sala;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		Palestra palestra = new Palestra();
		Palestrante palestrante = new Palestrante();
		Certificado certificado = new Certificado();
		Sala sala = new Sala();

		// não pode ser alterado por ser protegido
		// palestra.tema = "Testando";
		
		// palestrante.nome = "Marcelo"; // pode ser alterado por ser público
		
		// não pode ser alterado por ser privado
		// certificado.numeroCertificado = 1;
		
		// não pode ser alterado por não estar no mesmo pacote
		// sala.capacidade = 40;
		
		
	}

}
