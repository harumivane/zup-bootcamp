package com.harumivane.zupbootcamp.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.harumivane.zupbootcamp.entities.Conta;

public class ContaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Integer agencia;
	private Integer conta;
	private Integer codigoBanco;
	private Double saldo;
	
	public ContaDTO() {
	}

	public ContaDTO(Conta contaObj) {
		id = contaObj.getId();
		agencia = contaObj.getAgencia();
		conta = contaObj.getConta();
		codigoBanco = contaObj.getCodigoBanco();
		saldo = contaObj.getSaldo();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Integer getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
