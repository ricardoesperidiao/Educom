package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.entities.Atividade;

public interface IRepositoryAtividade {

	 public boolean salvarAtividade(Atividade atividade);
		public boolean atualizarAtividade(Atividade atividade);
		public boolean inativarAtividade(Atividade atividade);
		public List<Atividade> listarAtividade();
		public List<Atividade> procurarAtividade(String query);
}
