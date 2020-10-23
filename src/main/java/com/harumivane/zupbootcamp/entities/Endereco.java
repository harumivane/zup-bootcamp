package com.harumivane.zupbootcamp.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String cep;
	private String rua;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	
	public Endereco() {
	}

	public Endereco(String id, String cep, String rua, String bairro, String complemento, String cidade,
			String estado) {
		super();
		this.id = id;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
