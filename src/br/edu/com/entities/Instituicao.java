package br.edu.com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Instituicao {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String sigla;
	
	@ManyToOne
	private Professor professor;
	
	@OneToMany(mappedBy="instituicao", cascade={CascadeType.ALL,CascadeType.REMOVE},fetch = FetchType.EAGER)
	private List<Turma> turma = new ArrayList<>();

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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Instituicao [nome=" + nome + ", sigla=" + sigla + "]";
	}
	
	
}
