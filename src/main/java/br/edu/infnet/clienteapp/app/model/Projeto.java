package br.edu.infnet.clienteapp.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Projeto {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@OneToMany
	//private Cliente cliente;
	
	private String nomeProjeto;
	
	private String tipo;
	
	private String gerenteProjeto;
	
	private Float  valor;
	
	private Float  margemLucro;
	
	

	public Projeto() {
	}

	public Projeto(String nomeProjeto, String tipo, String gerenteProjeto, Float valor, Float margemLucro ) {
		super();
		this.nomeProjeto = nomeProjeto;
		this.tipo = tipo;
		this.gerenteProjeto = gerenteProjeto;
		this.valor = valor;
		this.margemLucro = margemLucro;
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGerenteProjeto() {
		return gerenteProjeto;
	}

	public void setGerenteProjeto(String gerenteProjeto) {
		this.gerenteProjeto = gerenteProjeto;
		
	}
	
	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Float getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(Float margemLucro) {
		this.margemLucro = margemLucro;
	}

}