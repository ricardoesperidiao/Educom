package br.edu.com.controller;

import br.edu.com.dados.repositories.IRepositoryAluno;
import br.edu.com.dados.repositories.IRepositoryAtividade;
import br.edu.com.dados.repositories.IRepositoryDisciplina;
import br.edu.com.dados.repositories.IRepositoryInstituicao;
import br.edu.com.dados.repositories.IRepositoryTurma;
import br.edu.com.dados.repositories.IRepositoryProfessor;
import br.edu.com.dados.repositories.IRepositoryUsuarioLogin;
import br.edu.com.dados.repositories.RepositoryAluno;
import br.edu.com.dados.repositories.RepositoryAtividade;
import br.edu.com.dados.repositories.RepositoryDisciplina;
import br.edu.com.dados.repositories.RepositoryInstituicao;
import br.edu.com.dados.repositories.RepositoryTurma;
import br.edu.com.dados.repositories.RepositoryProfessor;
import br.edu.com.dados.repositories.RepositoryUsuarioLogin;

public class Facade {

	private volatile static Facade instance;

	private IRepositoryProfessor IProfessor;
	private IRepositoryTurma ITurma;
	private IRepositoryDisciplina IDisciplina;
	private IRepositoryInstituicao IInstituicao;
	private IRepositoryAtividade IAtividade;
	private IRepositoryAluno IAluno;
	private IRepositoryUsuarioLogin IUsuarioLogin;
	
	private Facade() {
		
		IProfessor = new RepositoryProfessor();
		ITurma = new RepositoryTurma();
		IDisciplina = new RepositoryDisciplina();
		IInstituicao = new RepositoryInstituicao();
		IAtividade = new RepositoryAtividade();
		IAluno = new RepositoryAluno();
		IUsuarioLogin = new RepositoryUsuarioLogin();
		
	}

	public IRepositoryUsuarioLogin getIUsuarioLogin() {
		return this.IUsuarioLogin;
	}

	public static Facade getInstance() {
		if (instance == null) {
			synchronized (Facade.class) {
				instance = new Facade();
			}
		}
		return instance;
	}

	public IRepositoryProfessor getProfessor(){
		return this.IProfessor;
	}

	public IRepositoryTurma getITurma() {
		return this.ITurma;
	}

	public IRepositoryDisciplina getIDisciplina() {
		return this.IDisciplina;
	}

	public IRepositoryInstituicao getIInstituicao() {
		return this.IInstituicao;
	}

	public IRepositoryAtividade getIAtividade() {
		return this.IAtividade;
	}

	public IRepositoryAluno getIAluno() {
		return this.IAluno;
	}
	
	
	
	
}
