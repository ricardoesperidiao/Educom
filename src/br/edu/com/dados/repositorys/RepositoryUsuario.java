package br.edu.com.dados.repositorys;


import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.Usuario;

public class RepositoryUsuario implements IRepositoryUsuario{

	@Override
	public boolean salvarUsuario(Usuario usuario) {
		return Dao.getInstance().save(usuario);
	}

	@Override
	public boolean atualizarUsuario(Usuario usuario) {
		return Dao.getInstance().update(usuario);
	}

	@Override
	public boolean inativarUsuario(Usuario usuario) {
		return Dao.getInstance().update(usuario);
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return (List<Usuario>) Dao.getInstance().list(Usuario.class);
	}

	@Override
	public List<Usuario> procurarUsuario(String query) {
		return (List<Usuario>) Dao.getInstance().createQuery(query);
	}

}
