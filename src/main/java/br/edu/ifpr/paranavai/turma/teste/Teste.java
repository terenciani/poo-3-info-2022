package br.edu.ifpr.paranavai.turma.teste;

import br.edu.ifpr.paranavai.trabalho.implementacoes.InsercaoImpl;
import br.edu.ifpr.paranavai.trabalho.implementacoes.LeituraImpl;
import br.edu.ifpr.paranavai.trabalho.interfaces.IInserirDados;
import br.edu.ifpr.paranavai.trabalho.interfaces.ILeituraDeDados;
import br.edu.ifpr.paranavai.turma.Curso;

public class Teste {
	public static void main(String[] args) {
		ILeituraDeDados leitura = new LeituraImpl();
		IInserirDados insercao = new InsercaoImpl();
		Curso curso = leitura.lerDadosCurso();
		insercao.salvarCurso(curso);
	}
	
}
