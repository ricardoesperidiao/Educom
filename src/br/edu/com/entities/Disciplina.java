package br.edu.com.entities;

import javax.persistence.*;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Disciplina {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private String descricao;
	
	@OneToMany
	private List<Atividade> atividade;
	
	@ManyToOne
	@JoinColumn(name="idTurma")
	private Turma turma;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
