package br.edu.com.service;

import java.util.List;

import br.edu.com.entities.Usuario;
import br.edu.com.repositorys.IRepositoryUsuario;
import br.edu.com.repositorys.RepositoryUsuario;

public class ServiceUsuario implements IServiceUsuario {

	IRepositoryUsuario repositorio = new RepositoryUsuario();

	@Override
	public void salvar(Usuario usuario) {
		repositorio.salvarUsuario(usuario);
	}

	@Override
	public void atualizar(Usuario usuario) {
		repositorio.atualizarUsuario(usuario);
	}

	@Override
	public void inativar(Usuario usuario) {
		repositorio.inativarUsuario(usuario);
	}

	@Override
	public List<Usuario> List() {
		return repositorio.listarUsuarios();
	}

	@Override
	public List<Usuario> List(String query) {
		return repositorio.procurarUsuario(query);
	}

}
