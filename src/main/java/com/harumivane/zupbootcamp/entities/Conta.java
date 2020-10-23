package com.harumivane.zupbootcamp.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="conta")
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Integer agencia;
	private Integer conta;
	private Integer codigoBanco;
	private Double saldo;
	
	@DBRef(lazy=true)
	private Pessoa pessoa;
	
	public Conta() {
	}

	public Conta(String id, Integer agencia, Integer conta, Integer codigoBanco, Double saldo) {
		super();
		this.id = id;
		this.agencia = agencia;
		this.conta = conta;
		this.codigoBanco = codigoBanco;
		this.saldo = saldo;
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void deposit(Double valorTransferencia) {
		saldo += valorTransferencia;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + ", codigoBanco=" + codigoBanco + "]";
	}
}
