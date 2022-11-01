package br.edu.ifpr.paranavai.trabalho.interfaces;

import br.edu.ifpr.paranavai.turma.Aluno;
import br.edu.ifpr.paranavai.turma.Campus;
import br.edu.ifpr.paranavai.turma.Curso;
import br.edu.ifpr.paranavai.turma.Disciplina;
import br.edu.ifpr.paranavai.turma.Matricula;
import br.edu.ifpr.paranavai.turma.Professor;
import br.edu.ifpr.paranavai.turma.Turma;

public interface ILeituraDeDados {
	Aluno lerDadosAluno();
	Professor lerDadosProfessor();
	Curso lerDadosCurso();
	Turma lerDadosTurma();
	Turma lerDadosTurma(Curso curso);
	Disciplina lerDadosDisciplina(Professor professor, Turma turma);
	Matricula lerDadosMatricula();
	Matricula lerDadosMatricula(Aluno aluno, Turma turma);
	Campus lerDadosCampus();
}
