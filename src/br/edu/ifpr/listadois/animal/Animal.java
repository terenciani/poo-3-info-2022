package br.edu.ifpr.listadois.animal;

public class Animal {
   
	private String raca;
	private String nome;

	 public Animal() {
		 
	 }
	 /***
	  * 
	  * @param nome nome do animal registrado em cart�rio
	  */
	 public Animal(String nome) {
		 this.nome = nome;
		 
	 }
	 /***
	  * @param n�o recebe nada ;(
	  * @return oi eu sou o goku!
	  */
	 
	 public String caminha() {
		 
		 return " caminhando";
	 }
}
