package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.Instituicao;

public class RepositoryInstituicao implements IRepositoryInstituicao {

	@Override
	public boolean salvarInstituicao(Instituicao instituicao) {
		return Dao.getInstance().save(instituicao);
	}

	@Override
	public boolean atualizarInstituicao(Instituicao instituicao) {
		return Dao.getInstance().update(instituicao);
		
	}

	@Override
	public boolean inativarInstituicao(Instituicao instituicao) {
		return Dao.getInstance().delete(instituicao);
	}

	@Override
	public List<Instituicao> listarInstituicao() {
		return (List<Instituicao>) Dao.getInstance().list(Instituicao.class);
	}

	@Override
	public List<Instituicao> procurarInstituicao(String query) {
		return (List<Instituicao>) Dao.getInstance().createQuery(query);
	}

}
