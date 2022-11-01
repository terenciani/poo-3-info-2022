package br.edu.ifpr.paranavai.trabalho.interfaces;

import java.util.ArrayList;

import br.edu.ifpr.paranavai.turma.Aluno;
import br.edu.ifpr.paranavai.turma.Campus;
import br.edu.ifpr.paranavai.turma.Curso;
import br.edu.ifpr.paranavai.turma.Disciplina;
import br.edu.ifpr.paranavai.turma.Matricula;
import br.edu.ifpr.paranavai.turma.Professor;
import br.edu.ifpr.paranavai.turma.Turma;

public interface IBuscaDeDados {
	ArrayList<Matricula> buscarMatriculasAtivas();
	ArrayList<Matricula> buscarTodasMatriculas();
	ArrayList<Aluno> buscarAlunos();
	ArrayList<Turma> buscarTurmas();
	ArrayList<Professor> buscarProfessores();
	ArrayList<Disciplina> buscarDisciplinas();
	ArrayList<Curso> buscarCursos();
	ArrayList<Campus> buscarCampi();
}
