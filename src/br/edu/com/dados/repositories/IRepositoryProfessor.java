package br.edu.com.dados.repositories;

import java.util.List;

import br.edu.com.entities.Professor;

public interface IRepositoryProfessor {

   public boolean salvarUsuario(Professor professor);
	public boolean atualizarUsuario(Professor professor);
	public boolean inativarUsuario(Professor professor);
	public List<Professor> listarUsuarios();
	public List<Professor> procurarUsuario(String query);
	
}
