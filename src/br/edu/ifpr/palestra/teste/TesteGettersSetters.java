package br.edu.ifpr.palestra.teste;

import br.edu.ifpr.palestra.modelo.Palestrante;

public class TesteGettersSetters {
	public static void main(String[] args) {
		Palestrante palestrante = new Palestrante("Marcelo");
		Palestrante palestrante1 = new Palestrante("Marcelo 1");
		Palestrante palestrante2 = new Palestrante("Marcelo 2");
		Palestrante palestrante3 = new Palestrante("Marcelo 3");
		Palestrante palestrante4 = new Palestrante("Marcelo 4");
		Palestrante palestrante5 = new Palestrante("Marcelo 5");
		Palestrante palestrante6 = new Palestrante("Marcelo 6");
		Palestrante palestrante7 = new Palestrante("Marcelo 7");
		Palestrante palestrante8 = new Palestrante("Marcelo 8");
		Palestrante palestrante9 = new Palestrante("Marcelo 9");
		
		palestrante.nome = "Marcelo Novo";
		
		System.out.println(palestrante.nome.toUpperCase());
		System.out.println(palestrante1.nome.toUpperCase());
		System.out.println(palestrante2.nome.toUpperCase());
		System.out.println(palestrante3.nome.toUpperCase());
		System.out.println(palestrante4.nome.toUpperCase());
		System.out.println(palestrante5.nome.toUpperCase());
		System.out.println(palestrante6.nome.toUpperCase());
		System.out.println(palestrante7.nome.toUpperCase());
		System.out.println(palestrante8.nome.toUpperCase());
		System.out.println(palestrante9.nome.toUpperCase());
		System.out.println("Getter");
		System.out.println(palestrante.getNome());
		System.out.println(palestrante1.getNome());
		System.out.println(palestrante2.getNome());
		System.out.println(palestrante3.getNome());
		System.out.println(palestrante4.getNome());
		System.out.println(palestrante5.getNome());
		System.out.println(palestrante6.getNome());
		System.out.println(palestrante7.getNome());
		System.out.println(palestrante8.getNome());
		System.out.println(palestrante9.getNome());
	}

}
