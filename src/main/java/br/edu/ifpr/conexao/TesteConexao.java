package br.edu.ifpr.conexao;

public class TesteConexao {
	public static void main(String[] args) {
		if (Conexao.getConexao() != null) {
			System.out.println("Conectou!");
		}else {
			System.out.println("NNão Conectou!");
		}
	}
}
