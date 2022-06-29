package br.edu.ifpr.listadois.animal;

public class Animal {
   
	private String raca;
	private String nome;

	 public Animal() {
		 
	 }
	 /***
	  * 
	  * @param nome nome do animal registrado em cartório
	  */
	 public Animal(String nome) {
		 this.nome = nome;
		 
	 }
	 /***
	  * @param não recebe nada ;(
	  * @return oi eu sou o goku!
	  */
	 
	 public String caminha() {
		 
		 return " caminhando";
	 }
}
