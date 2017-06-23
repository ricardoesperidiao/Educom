package br.edu.com.facade;

import java.util.List;

import br.edu.com.entities.Usuario;
import br.edu.com.service.IServiceUsuario;
import br.edu.com.service.ServiceUsuario;

public class Facade {

	private static Facade instance;

	private IServiceUsuario serviceUsuario;
	
	private Facade() {
		serviceUsuario= new ServiceUsuario();
		
	}
 // Sabe o que é isso ?
	public static Facade getInstance() {
		if (instance == null) {
			instance = new Facade();
		}
		return instance;
	}

	// Coordenador
	public void salvarUsuario(Usuario usuario){
		serviceUsuario.salvar(usuario);
	}

	public void atualizarUsuario(Usuario usuario){
		serviceUsuario.atualizar(usuario);
	}

	public void inativarUsuario(Usuario usuario) {
		serviceUsuario.inativar(usuario);
	}

	public List<Usuario> listarUsuario() {
		return serviceUsuario.List();
	}

	public List<Usuario> listarUsuarioQuery(String query) {
		return serviceUsuario.List(query);
	}

	
}
