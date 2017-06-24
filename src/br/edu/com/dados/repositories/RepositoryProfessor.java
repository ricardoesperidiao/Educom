package br.edu.com.dados.repositories;


import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.Professor;

public class RepositoryProfessor implements IRepositoryProfessor{

	@Override
	public boolean salvarUsuario(Professor professor) {
		return Dao.getInstance().save(professor);
	}

	@Override
	public boolean atualizarUsuario(Professor professor) {
		return Dao.getInstance().update(professor);
	}

	@Override
	public boolean inativarUsuario(Professor professor) {
		return Dao.getInstance().update(professor);
	}

	@Override
	public List<Professor> listarUsuarios() {
		return (List<Professor>) Dao.getInstance().list(Professor.class);
	}

	@Override
	public List<Professor> procurarUsuario(String query) {
		return (List<Professor>) Dao.getInstance().createQuery(query);
	}

}
