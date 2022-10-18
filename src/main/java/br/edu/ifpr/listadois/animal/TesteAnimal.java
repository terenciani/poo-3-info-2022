package br.edu.ifpr.listadois.animal;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.latir();
		
		Gato gato = new Gato();
		gato.miar();
		
		String mensagem = cachorro.caminha();
		System.out.println(mensagem);
		
		System.out.println(gato.caminha() + cachorro.caminha());
		Animal animal = new Animal("tayná");
		System.out.println(1+1+"oi"+(1+1));
		System.err.println(mensagem);
	}

}
