package br.edu.com.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@ManyToOne
	private Instituicao instituicao;
	
	@OneToMany(mappedBy="turma", cascade={CascadeType.ALL,CascadeType.REMOVE},fetch = FetchType.EAGER)
	private List<Disciplina> disciplinas;
	
	@OneToMany(mappedBy="turma", cascade={CascadeType.ALL,CascadeType.REMOVE},fetch = FetchType.EAGER)
	private List<Aluno> alunos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	

}
