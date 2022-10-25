package br.edu.ifpr.conexao;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.acessar.bancodados.CampusDAO;
import br.edu.ifpr.paranavai.turma.Campus;

public class TesteConexao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		CampusDAO campusDAO = new CampusDAO();
		System.out.println("Informe o nome do Campus");
		String nome = teclado.nextLine();
		System.out.println("Informe o Endereço do Campus");
		String endereco = teclado.nextLine();
		System.out.println("Informe a Cidade do Campus");
		String cidade = teclado.nextLine();
		
		Campus campus = new Campus();
		campus.setNome(nome);
		campus.setEndereco(endereco);
		campus.setCidade(cidade);
		
		campusDAO.salvarCampus(campus);
		
		ArrayList<Campus> listaCampus = campusDAO.listar();
		
		for (Campus c : listaCampus) {
			System.out.println(c.getNome());
		}
		
		
	}
}
