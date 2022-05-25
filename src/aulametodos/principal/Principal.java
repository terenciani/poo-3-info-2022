package aulametodos.principal;

import aulametodos.modelo.Carro;

public class Principal {
	public static void main(String[] args) {
		Carro kombi = new Carro();
		
		kombi.ligado = true;
		
		System.out.println("Linha 8: " + kombi.velocidade); // 0
		for (int i = 0; i < 50; i++) {
			kombi.acelerar();
		}
		System.out.println("Linha 12: " + kombi.velocidade); // 50		
		kombi.frear();
		System.out.println("Linha 14: " + kombi.velocidade); // 0
		for (int i = 0; i < 500; i++) {
			kombi.acelerar();
		}
		System.out.println("Linha 16: " + kombi.velocidade); // 500
		kombi.engatarRe();
		System.out.println("Linha 18: " + kombi.sentido);
	}
}
