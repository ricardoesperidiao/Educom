package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.entities.Instituicao;

public interface IRepositoryInstituicao {

	 public boolean salvarInstituicao(Instituicao instituicao);
		public boolean atualizarInstituicao(Instituicao instituicao);
		public boolean inativarInstituicao(Instituicao instituicao);
		public List<Instituicao> listarInstituicao();
		public List<Instituicao> procurarInstituicao(String query);
}
