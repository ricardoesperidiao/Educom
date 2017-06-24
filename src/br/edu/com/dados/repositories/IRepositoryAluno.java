package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.entities.Aluno;

public interface IRepositoryAluno {
	
	 public boolean salvarAluno(Aluno aluno);
		public boolean atualizarAluno(Aluno aluno);
		public boolean inativarAluno(Aluno aluno);
		public List<Aluno> listarAluno();
		public List<Aluno> procurarAluno(String query);

}
