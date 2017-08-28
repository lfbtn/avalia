package br.lb.avalia.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "AVA_AVALIACAO")
public class Avaliacao {

	@Id
	@Column(name = "avaliacao_ID", nullable = false)
	@GeneratedValue
	private Integer id;

	// private User professor;
	private Date inclusao;
	private Date aplicacao;
	private String disciplina;
	private String professor;
	private String descricao;
	private String dificuldade;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable
	private List<Turma> turmas;

	@OneToMany(mappedBy = "avaliacao", targetEntity = Pergunta.class, fetch = FetchType.EAGER)
	private List<Pergunta> perguntas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInclusao() {
		return inclusao;
	}

	public void setInclusao(Date inclusao) {
		this.inclusao = inclusao;
	}

	public Date getAplicacao() {
		return aplicacao;
	}

	public void setAplicacao(Date aplicacao) {
		this.aplicacao = aplicacao;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
