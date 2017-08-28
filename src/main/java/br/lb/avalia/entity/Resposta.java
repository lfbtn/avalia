package br.lb.avalia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AVA_RESPOSTA")
public class Resposta {

	@Id
	@GeneratedValue
	private Integer id;
	private String texto;
	private Boolean isCerta;
	
    @ManyToOne(optional=true)
    @JoinColumn(name="pergunta_ID",referencedColumnName="pergunta_ID")
    private Pergunta pergunta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Boolean getIsCerta() {
		return isCerta;
	}

	public void setIsCerta(Boolean isCerta) {
		this.isCerta = isCerta;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}


}
