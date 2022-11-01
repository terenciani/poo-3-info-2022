package br.edu.ifpr.paranavai.trabalho.interfaces;

import br.edu.ifpr.paranavai.turma.Aluno;
import br.edu.ifpr.paranavai.turma.Campus;
import br.edu.ifpr.paranavai.turma.Curso;
import br.edu.ifpr.paranavai.turma.Disciplina;
import br.edu.ifpr.paranavai.turma.Matricula;
import br.edu.ifpr.paranavai.turma.Professor;
import br.edu.ifpr.paranavai.turma.Turma;

public interface IInserirDados {
	void salvarAluno(Aluno aluno);
	void salvarProfessor(Professor professor);
	public void salvarCurso(Curso curso);
	void salvarTurma(Turma turma);
	void salvarDisciplina(Disciplina disciplina);
	void salvarMatricula(Matricula matricula);
	void salvarCampus(Campus campus);
}
