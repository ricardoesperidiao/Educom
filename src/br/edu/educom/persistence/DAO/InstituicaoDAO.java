package br.edu.educom.persistence.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.com.entities.Instituicao;
import br.edu.com.entities.Usuario;
import br.edu.educom.persistence.ConnectionFactory;

public class InstituicaoDAO {
	
private Connection connection;
	
	public InstituicaoDAO() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void adicionar(Instituicao instituicao) {
		
		String sql = "INSERT INTO instituicao ( nome, sigla ) Values (?,?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, instituicao.getNome());
			stmt.setString(2, instituicao.getSigla());	
			
			stmt.execute(); //stmt.executeUpdate(); ?
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	public List<Instituicao> getLista() throws SQLException {
		
		List<Instituicao> instituicoes = new ArrayList<Instituicao>();
		PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM instituicao");
		ResultSet rs = stmt.executeQuery(); 
		
		while (rs.next()) {
			
			Instituicao inst = new Instituicao();
			inst.setNome(rs.getString("nome"));
			inst.setSigla(rs.getString("sigla"));
			instituicoes.add(inst);
		}
		rs.close();
		stmt.close();
		return instituicoes;
	}
	
	public void alterar(Instituicao instituicao) {
		
		String sql = "UPDATE instituicao SET nome=?, sigla=? where sigla=?";  // Corrigir trazer pelo ID
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, instituicao.getNome());
			stmt.setString(2, instituicao.getSigla());
			
			stmt.execute();
			stmt.close();		
		} catch (SQLException e) {
			// TODO: handle exception
		}
			
	}
	
	public void remover(Instituicao instituicao) {
		
		try {
			PreparedStatement stmt = connection.prepareStatement("DELETE from instituicao where sigla=?"); // Corrigir trazer pelo ID
			stmt.setString(1,instituicao.getSigla());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			
		}
		
	}
}
