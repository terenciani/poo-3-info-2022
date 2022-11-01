package br.edu.ifpr.paranavai.turma;

public class Curso {
	private int idCurso;
	private String nome;
	private String duracao;
	private String modalidade;
	private Campus campus;

	public Curso() {

	}

	public Curso(int idCurso, String nome, String duracao, String modalidade, Campus campus) {
		super();
		this.idCurso = idCurso;
		this.nome = nome;
		this.duracao = duracao;
		this.modalidade = modalidade;
		this.campus = campus;
	}

	public Curso(String nome, String duracao, String modalidade, Campus campus) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.modalidade = modalidade;
		this.campus = campus;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

}
