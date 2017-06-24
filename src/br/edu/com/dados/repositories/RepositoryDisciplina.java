package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.Disciplina;

public class RepositoryDisciplina implements IRepositoryDisciplina {

	@Override
	public boolean salvarDisciplina(Disciplina disciplina) {
		return Dao.getInstance().save(disciplina);
	}

	@Override
	public boolean atualizarDisciplina(Disciplina disciplina) {
		return Dao.getInstance().update(disciplina);
	}

	@Override
	public boolean inativarDisciplina(Disciplina disciplina) {
		return Dao.getInstance().delete(disciplina);
	}

	@Override
	public List<Disciplina> listarDisciplina() {
		return (List<Disciplina>) Dao.getInstance().list(Disciplina.class);
}

	@Override
	public List<Disciplina> procurarDisciplina(String query) {
		return (List<Disciplina>) Dao.getInstance().createQuery(query);
		
	}

}
