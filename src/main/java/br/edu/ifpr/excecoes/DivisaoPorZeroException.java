package br.edu.ifpr.excecoes;

public class DivisaoPorZeroException extends ArithmeticException{
	public DivisaoPorZeroException() {
		super("Deu pau / por zero");
	}
	
	public DivisaoPorZeroException(String mensagem) {
		super(mensagem);
	}
}
