package br.edu.educom.persistence.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.com.entities.Usuario;
import br.edu.educom.persistence.ConnectionFactory;

public class UsuarioDAO {
	
private Connection connection;
	
	public UsuarioDAO() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void adicionar(Usuario usuario) {
		
		String sql = "INSERT INTO usuario ( email, senha, cpf ) Values (?,?,?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, usuario.getEmail());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getCpf());	
			
			stmt.execute(); //stmt.executeUpdate(); ?
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	public List<Usuario> getLista() throws SQLException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM usuario");
		ResultSet rs = stmt.executeQuery(); 
		
		while (rs.next()) {
			
			Usuario user = new Usuario();
			user.setEmail(rs.getString("email"));
			user.setSenha(rs.getString("senha"));
			user.setCpf(rs.getString("cpf"));
			usuarios.add(user);
		}
		rs.close();
		stmt.close();
		return usuarios;
	}
	
	public void alterar(Usuario usuario) {
		
		String sql = "UPDATE usuario SET email=?, cpf=?, senha=? where email=?";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getEmail());
			stmt.setString(2, usuario.getCpf());
			stmt.setString(3, usuario.getSenha());
			
			stmt.execute();
			stmt.close();		
		} catch (SQLException e) {
			// TODO: handle exception
		}
			
	}
	
	public void remover(Usuario usuario) {
		
		try {
			PreparedStatement stmt = connection.prepareStatement("DELETE from usuario where email=?");
			stmt.setString(1,usuario.getEmail());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			
		}
		
	}
	
}
