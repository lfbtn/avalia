package br.lb.avalia.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.lb.admin.entity.User;

@Entity
@Table(name = "AVA_TURMA")
public class Turma {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
    private int ano;
    private int semestre;
    
    private String disciplina;
    
    //@JsonIgnore
	//@ManyToMany(mappedBy = "turmas", fetch = FetchType.EAGER)
    //private User professor;
    
    private String professor;
    
    @JsonIgnore
	@ManyToMany(mappedBy = "turmas", fetch = FetchType.EAGER)
	private List<User> alunos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public List<User> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<User> alunos) {
		this.alunos = alunos;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

    
}
