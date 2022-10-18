package br.edu.ifpr.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestadoraDeExcecoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 0;
		boolean digitouUmNumero = true;
		do {
			try {
				System.out.println("Digite um n�mero:");
				x = teclado.nextInt();
				digitouUmNumero = false;
			} catch (InputMismatchException excecao) {
				System.out.println("Caracter inv�lido");
				teclado.next();
			} finally {
				System.out.println("finally");
			}
		}while(digitouUmNumero);

		System.out.println("n�mero digitado: " + x);

	}
}
