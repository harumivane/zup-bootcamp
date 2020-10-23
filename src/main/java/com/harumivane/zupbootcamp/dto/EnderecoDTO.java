package com.harumivane.zupbootcamp.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

import com.harumivane.zupbootcamp.entities.Endereco;

public class EnderecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	@NotBlank
	private String cep;
	@NotBlank
	private String rua;
	@NotBlank
	private String bairro;
	@NotBlank
	private String complemento;
	@NotBlank
	private String cidade;
	@NotBlank
	private String estado;
	
	public EnderecoDTO() {
	}

	public EnderecoDTO(Endereco endereco) {
		id = endereco.getId();
		cep = endereco.getCep();
		rua = endereco.getRua();
		bairro = endereco.getBairro();
		complemento = endereco.getComplemento();
		cidade = endereco.getCidade();
		estado = endereco.getEstado();
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
