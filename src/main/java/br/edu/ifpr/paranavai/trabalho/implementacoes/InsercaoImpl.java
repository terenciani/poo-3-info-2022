package br.edu.ifpr.paranavai.trabalho.implementacoes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.conexao.Conexao;
import br.edu.ifpr.paranavai.trabalho.interfaces.IInserirDados;
import br.edu.ifpr.paranavai.turma.Aluno;
import br.edu.ifpr.paranavai.turma.Campus;
import br.edu.ifpr.paranavai.turma.Curso;
import br.edu.ifpr.paranavai.turma.Disciplina;
import br.edu.ifpr.paranavai.turma.Matricula;
import br.edu.ifpr.paranavai.turma.Professor;
import br.edu.ifpr.paranavai.turma.Turma;

public class InsercaoImpl implements IInserirDados {

	public void salvarAluno(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	public void salvarProfessor(Professor professor) {
		// TODO Auto-generated method stub

	}

	public void salvarCurso(Curso curso) {
		String SQL = "INSERT INTO tb_curso (nome, duracao, modalidade, fk_campus) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, curso.getNome());
			preparacaoDaInstrucao.setString(2, curso.getDuracao());
			preparacaoDaInstrucao.setString(3, curso.getModalidade());
			preparacaoDaInstrucao.setInt(4, curso.getCampus().getIdCampus());
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	public void salvarTurma(Turma turma) {
		// TODO Auto-generated method stub

	}

	public void salvarDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub

	}

	public void salvarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub

	}

	public void salvarCampus(Campus campus) {
		String SQL = "INSERT INTO tb_campus (nome, endereco, cidade) VALUES (?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, campus.getNome());
			preparacaoDaInstrucao.setString(2, campus.getEndereco());
			preparacaoDaInstrucao.setString(3, campus.getCidade());
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

}
