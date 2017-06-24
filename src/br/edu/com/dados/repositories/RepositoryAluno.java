package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.dados.dao.Dao;
import br.edu.com.entities.Aluno;

public class RepositoryAluno implements IRepositoryAluno {

	@Override
	public boolean salvarAluno(Aluno aluno) {
		return Dao.getInstance().save(aluno);
	}

	@Override
	public boolean atualizarAluno(Aluno aluno) {
		return Dao.getInstance().update(aluno);
	}

	@Override
	public boolean inativarAluno(Aluno aluno) {
		return Dao.getInstance().delete(aluno);
	}

	@Override
	public List<Aluno> listarAluno() {
		return (List<Aluno>) Dao.getInstance().list(Aluno.class);
	}

	@Override
	public List<Aluno> procurarAluno(String query) {
		return (List<Aluno>) Dao.getInstance().createQuery(query);
	}

}
