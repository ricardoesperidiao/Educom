package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.UsuarioLogin;

public class RepositoryUsuarioLogin implements IRepositoryUsuarioLogin {

	@Override
	public boolean salvarUsuarioLogin(UsuarioLogin usuarioLogin) {
		return Dao.getInstance().save(usuarioLogin);
		
	}

	@Override
	public boolean atualizarUsuarioLogin(UsuarioLogin usuarioLogin) {
		return Dao.getInstance().update(usuarioLogin);
		
	}

	@Override
	public boolean inativarUsuarioLogin(UsuarioLogin usuarioLogin) {
		return Dao.getInstance().delete(usuarioLogin);
	}

	@Override
	public List<UsuarioLogin> listarUsuarioLogin() {
		return (List<UsuarioLogin>) Dao.getInstance().list(UsuarioLogin.class);
	}

	@Override
	public List<UsuarioLogin> procurarUsuarioLogin(String query) {
		return (List<UsuarioLogin>) Dao.getInstance().createQuery(query);
	}

}
