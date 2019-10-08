package br.edu.infnet.clienteapp.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String CNPJ;
	
	private String segmento;
	
	private Float  faturamento;
	
	
	public Cliente() {
	}

	public Cliente(String nome, String CNPJ, String segmento, Float faturamento) {
		super();
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.segmento = segmento;
		this.faturamento = faturamento;
	
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Float faturamento) {
		this.faturamento = faturamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	}