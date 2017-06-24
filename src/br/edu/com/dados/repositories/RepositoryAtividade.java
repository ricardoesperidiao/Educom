package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.Atividade;

public class RepositoryAtividade implements IRepositoryAtividade {

	@Override
	public boolean salvarAtividade(Atividade atividade) {
		return Dao.getInstance().save(atividade);
	}

	@Override
	public boolean atualizarAtividade(Atividade atividade) {
		return Dao.getInstance().update(atividade);
	}

	@Override
	public boolean inativarAtividade(Atividade atividade) {
		return Dao.getInstance().delete(atividade);
	}

	@Override
	public List<Atividade> listarAtividade() {
		return (List<Atividade>) Dao.getInstance().list(Atividade.class);
	}

	@Override
	public List<Atividade> procurarAtividade(String query) {
		return (List<Atividade>) Dao.getInstance().createQuery(query);
		
	}

}
