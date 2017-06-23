package br.edu.com.service;

import java.util.List;

import br.edu.com.entities.Usuario;

public interface IServiceUsuario {

	public void salvar(Usuario usuario); 
	public void atualizar(Usuario usuario);
	public void inativar(Usuario usuario);
	public List<Usuario> List();
	public List<Usuario> List(String query);
	
}
