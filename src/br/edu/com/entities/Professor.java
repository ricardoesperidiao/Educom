package br.edu.com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Professor {
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public Professor(UsuarioLogin user) {
		usuarioLogin = user;
	}
	
	@Id	
	@GeneratedValue
	private Long id;
	
	@OneToOne(cascade={CascadeType.ALL,CascadeType.REMOVE})
	private UsuarioLogin usuarioLogin;
	
	@OneToMany(mappedBy="professor", cascade={CascadeType.ALL,CascadeType.REMOVE},fetch = FetchType.EAGER)
	private List<Instituicao> instituicao = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UsuarioLogin getUsuarioLogin() {
		return usuarioLogin;
	}

	public void setUsuarioLogin(UsuarioLogin usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	public List<Instituicao> getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(List<Instituicao> instituicao) {
		this.instituicao = instituicao;
	}

	
}
