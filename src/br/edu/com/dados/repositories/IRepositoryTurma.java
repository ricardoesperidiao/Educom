package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.entities.Turma;

public interface IRepositoryTurma {
	
	 public boolean salvarTurma(Turma turma);
		public boolean atualizarTurma(Turma turma);
		public boolean inativarTurma(Turma turma);
		public List<Turma> listarTurma();
		public List<Turma> procurarTurma(String query);

}
