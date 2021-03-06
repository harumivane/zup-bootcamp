package com.harumivane.zupbootcamp.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="transferencia")
public class Transferencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Double valor;
	private Date dataRealizacao;
	private String documento;
	private Integer bancoOrigem;
	private Integer contaOrigem;
	private Integer agenciaOrigem;
	private Integer contaDestino;
	private Integer agenciaDestino;
	
	public Transferencia() {
	}

	public Transferencia(String id, Double valor, Date dataRealizacao, String documento, Integer bancoOrigem,
			Integer contaOrigem, Integer agenciaOrigem, Integer contaDestino, Integer agenciaDestino) {
		super();
		this.id = id;
		this.valor = valor;
		this.dataRealizacao = dataRealizacao;
		this.documento = documento;
		this.bancoOrigem = bancoOrigem;
		this.contaOrigem = contaOrigem;
		this.agenciaOrigem = agenciaOrigem;
		this.contaDestino = contaDestino;
		this.agenciaDestino = agenciaDestino;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Integer getBancoOrigem() {
		return bancoOrigem;
	}

	public void setBancoOrigem(Integer bancoOrigem) {
		this.bancoOrigem = bancoOrigem;
	}

	public Integer getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Integer contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Integer getAgenciaOrigem() {
		return agenciaOrigem;
	}

	public void setAgenciaOrigem(Integer agenciaOrigem) {
		this.agenciaOrigem = agenciaOrigem;
	}

	public Integer getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Integer contaDestino) {
		this.contaDestino = contaDestino;
	}

	public Integer getAgenciaDestino() {
		return agenciaDestino;
	}

	public void setAgenciaDestino(Integer agenciaDestino) {
		this.agenciaDestino = agenciaDestino;
	}	
}
