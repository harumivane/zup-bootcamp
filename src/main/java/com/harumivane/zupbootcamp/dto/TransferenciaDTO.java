package com.harumivane.zupbootcamp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

import com.harumivane.zupbootcamp.entities.Transferencia;

public class TransferenciaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	@NotEmpty
	private Double valor;
	private Date dataRealizacao;
	@NotEmpty
	private String documento;
	@NotEmpty
	private Integer bancoOrigem;
	@NotEmpty
	private Integer contaOrigem;
	//@NotEmpty
	private Integer agenciaOrigem;
	@NotEmpty
	private Integer contaDestino;
	@NotEmpty
	private Integer agenciaDestino;
	
	public TransferenciaDTO() {
	}
	
	public TransferenciaDTO(Transferencia transferencia) {
		id = transferencia.getId();
		valor = transferencia.getValor();
		dataRealizacao = transferencia.getDataRealizacao();
		documento = transferencia.getDocumento();
		bancoOrigem = transferencia.getBancoOrigem();
		contaOrigem = transferencia.getContaOrigem();
		agenciaOrigem = transferencia.getAgenciaOrigem();
		contaDestino = transferencia.getContaDestino();
		agenciaDestino = transferencia.getAgenciaDestino();
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
