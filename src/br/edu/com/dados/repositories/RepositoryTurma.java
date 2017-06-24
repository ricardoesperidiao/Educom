package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.Turma;

public class RepositoryTurma implements IRepositoryTurma {

	@Override
	public boolean salvarTurma(Turma turma) {
		return Dao.getInstance().save(turma);
	}

	@Override
	public boolean atualizarTurma(Turma turma) {
		return Dao.getInstance().update(turma);
	}

	@Override
	public boolean inativarTurma(Turma turma) {
		return Dao.getInstance().delete(turma);
	}

	@Override
	public List<Turma> listarTurma() {
		return (List<Turma>) Dao.getInstance().list(Turma.class);
	}

	@Override
	public List<Turma> procurarTurma(String query) {
		return (List<Turma>) Dao.getInstance().createQuery(query);
	}

}
