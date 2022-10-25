package br.edu.ifpr.acessar.bancodados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.conexao.Conexao;
import br.edu.ifpr.paranavai.turma.Campus;

public class CampusDAO {
	// inserção
	// atualização
	// remoção
	public ArrayList<Campus> listar(){
		ArrayList<Campus> listaDeCampus = new ArrayList<Campus>();
		String SQL = "SELECT * FROM matricula.tb_campus";
		
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();
			
			while(resultado.next()) {
				Campus campus = transformarResultSetEmObjeto(resultado);
				listaDeCampus.add(campus);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
		return listaDeCampus;
	}
	
	public void salvarCampus(Campus campus) {
		String SQL = "INSERT INTO tb_campus (nome, endereco, cidade) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setString(1, campus.getNome());
			preparacaoDaInstrucao.setString(2, campus.getEndereco());
			preparacaoDaInstrucao.setString(3, campus.getCidade());
			
			preparacaoDaInstrucao.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// transformação
	public Campus transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Campus campus = new Campus();
		try {
			campus.setIdCampus(resultSet.getInt("id_campus"));
			campus.setNome(resultSet.getString("nome"));
			campus.setEndereco(resultSet.getString("endereco"));
			campus.setCidade(resultSet.getString("cidade"));
			return campus;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}
	
}
