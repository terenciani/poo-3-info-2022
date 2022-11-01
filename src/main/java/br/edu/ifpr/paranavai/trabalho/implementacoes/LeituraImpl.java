package br.edu.ifpr.paranavai.trabalho.implementacoes;

import java.util.Scanner;

import br.edu.ifpr.paranavai.trabalho.interfaces.ILeituraDeDados;
import br.edu.ifpr.paranavai.turma.Aluno;
import br.edu.ifpr.paranavai.turma.Campus;
import br.edu.ifpr.paranavai.turma.Curso;
import br.edu.ifpr.paranavai.turma.Disciplina;
import br.edu.ifpr.paranavai.turma.Matricula;
import br.edu.ifpr.paranavai.turma.Professor;
import br.edu.ifpr.paranavai.turma.Turma;

public class LeituraImpl implements ILeituraDeDados{

	public Aluno lerDadosAluno() {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor lerDadosProfessor() {
		// TODO Auto-generated method stub
		return null;
	}

	public Curso lerDadosCurso() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do curso:");
		String nome = teclado.nextLine();
		System.out.println("Informe a duração do curso:");
		String duracao = teclado.nextLine();
		System.out.println("Informe a modalidade do curso");
		String modalidade = teclado.nextLine();
		
		System.out.println("Informe o código do campus");
		int idCampus = teclado.nextInt();
		
		Campus campus = new Campus();
		campus.setIdCampus(idCampus);
		
		Curso curso = new Curso(nome, duracao, modalidade, campus);
		return curso;
	}

	public Turma lerDadosTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	public Turma lerDadosTurma(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		// TODO Auto-generated method stub
		return null;
	}

	public Matricula lerDadosMatricula() {
		// TODO Auto-generated method stub
		return null;
	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		// TODO Auto-generated method stub
		return null;
	}

	public Campus lerDadosCampus() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do campus:");
		String nome = teclado.nextLine();
		System.out.println("Informe o endereço do campus:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a cidade do campus:");
		String cidade = teclado.nextLine();
		Campus campus = new Campus(nome, endereco, cidade);
		return campus;
	}

}
