package br.edu.com.controller;

import br.edu.com.dados.repositorys.IRepositoryUsuario;
import br.edu.com.dados.repositorys.RepositoryUsuario;

public class Facade {

	private static Facade instance;

	private IRepositoryUsuario iUsuario;
	
	private Facade() {
		iUsuario = new RepositoryUsuario();
		
	}

	public static Facade getInstance() {
		if (instance == null) {
			instance = new Facade();
		}
		return instance;
	}

	public IRepositoryUsuario getUsuario(){
		return this.iUsuario;
	}
	
}
