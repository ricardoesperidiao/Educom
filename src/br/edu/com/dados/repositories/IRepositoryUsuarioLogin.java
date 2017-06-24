package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.entities.UsuarioLogin;

public interface IRepositoryUsuarioLogin {
	
	 	public boolean salvarUsuarioLogin(UsuarioLogin usuarioLogin);
		public boolean atualizarUsuarioLogin(UsuarioLogin usuarioLogin);
		public boolean inativarUsuarioLogin(UsuarioLogin usuarioLogin);
		public List<UsuarioLogin> listarUsuarioLogin();
		public List<UsuarioLogin> procurarUsuarioLogin(String query);
		
}
