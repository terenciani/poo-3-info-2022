package br.edu.ifpr.excecoes;

public class Calculadora {
	public static double divisao(double dividendo, double divisor) throws
	DivisaoPorZeroException{
		if(divisor == 0) {
			throw new DivisaoPorZeroException();
		}else {
			return dividendo / divisor;
		}
		
	}
}
