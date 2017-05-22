package br.edu.educom.tests;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.educom.persistence.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conexao = new ConnectionFactory().getConnection();
		System.out.println("Conectado!");
		conexao.close();
		
	}
	
}