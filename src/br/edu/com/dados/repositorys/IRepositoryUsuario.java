package br.edu.com.dados.repositorys;

import java.util.List;

import br.edu.com.entities.Usuario;

public interface IRepositoryUsuario {

   public boolean salvarUsuario(Usuario usuario);
	public boolean atualizarUsuario(Usuario usuario);
	public boolean inativarUsuario(Usuario usuario);
	public List<Usuario> listarUsuarios();
	public List<Usuario> procurarUsuario(String query);
	
}
