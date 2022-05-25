package br.edu.ifpr.paranavai.palestra;

public class Principal {

	public static void main(String[] args) {

		Palestra evento = new Palestra("autismo", "sala 1", true);
		System.out.println("Informações do Evento");
		System.out.println(evento.tema);
		System.out.println(evento.diaHora);
		System.out.println(evento.exigeFrequencia);
		Palestrante especialista = new Palestrante("Alan", "1234432166", "Disney", "15469521", "31/02/1899", "Orlando",
				"Florida");

		System.out.println("Informações do Palestante");
		System.out.println(especialista.nome);
		System.out.println(especialista.cpf);
		System.out.println(especialista.endereco);
		System.out.println(especialista.rg);
		System.out.println(especialista.dataNascimento);
		System.out.println(especialista.cidadeNascimento);
		System.out.println(especialista.estadoNascimento);

		Participante aluno = new Participante("Tiffany", "tiffanylarissa04@gmail.com", "12561841844");
		System.out.println("Informação do Participante");
		System.out.println(aluno.nome);
		System.out.println(aluno.email);
		System.out.println(aluno.cpf);
		
		Certificado documento = new Certificado(50, 36, 23, 127);
		System.out.println("Informação do certificado");
		System.out.println(documento.livro);
		System.out.println(documento.folha);
		System.out.println(documento.pagina);
		System.out.println(documento.numeroCertificado);

		Sala local = new Sala(127, "Labien", "ifpr");
		System.out.println("Informação da Sala");
		System.out.println(local.capacidade);
		System.out.println(local.nome);
		System.out.println(local.local);

	}

}