package br.lb.avalia.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AVA_PERGUNTA")
public class Pergunta {

    @Id
    @Column(name = "pergunta_ID", nullable = false)
    @GeneratedValue
    private Integer id;
    
    private String pergunta;
    private String autor;
    private String fonte;
    
    @ManyToOne(optional=true)
    @JoinColumn(name="avaliacao_ID",referencedColumnName="avaliacao_ID")
    private Avaliacao avaliacao;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pergunta") 
	private List<Resposta> respostas;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
    
    

}
