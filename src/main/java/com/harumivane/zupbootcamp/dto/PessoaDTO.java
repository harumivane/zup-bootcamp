package com.harumivane.zupbootcamp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import com.harumivane.zupbootcamp.entities.Pessoa;

public class PessoaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String sobrenome;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private Date dataNascimento;
	@NotEmpty
	@CPF
	private String cpf;
	
	public PessoaDTO() {
	}

	public PessoaDTO(Pessoa pessoa) {
		id = pessoa.getId();
		nome = pessoa.getNome();
		sobrenome = pessoa.getSobrenome();
		email = pessoa.getEmail();
		dataNascimento = pessoa.getDataNascimento();
		cpf = pessoa.getCpf();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
