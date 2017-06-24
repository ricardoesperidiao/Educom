package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.entities.Disciplina;

public interface IRepositoryDisciplina {
	
	 public boolean salvarDisciplina(Disciplina disciplina);
		public boolean atualizarDisciplina(Disciplina disciplina);
		public boolean inativarDisciplina(Disciplina disciplina);
		public List<Disciplina> listarDisciplina();
		public List<Disciplina> procurarDisciplina(String query);

}
