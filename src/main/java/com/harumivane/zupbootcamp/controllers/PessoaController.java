package com.harumivane.zupbootcamp.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.harumivane.zupbootcamp.dto.EnderecoDTO;
import com.harumivane.zupbootcamp.dto.PessoaDTO;
import com.harumivane.zupbootcamp.entities.Endereco;
import com.harumivane.zupbootcamp.entities.Pessoa;
import com.harumivane.zupbootcamp.services.EnderecoService;
import com.harumivane.zupbootcamp.services.PessoaService;

@RestController
@RequestMapping(value="/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@Autowired
	private EnderecoService serviceEndereco;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody PessoaDTO pessoaDto) {
		Pessoa pessoa = service.fromDTO(pessoaDto);
		pessoa = service.insert(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoa.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<PessoaDTO> findById(@PathVariable String id) {
		Pessoa pessoa = service.findById(id);
		return ResponseEntity.ok().body(new PessoaDTO(pessoa));
	}
	
	@RequestMapping(value="/{id}/endereco", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody EnderecoDTO enderecoDto, @PathVariable String id) {
		Pessoa pessoa = service.findById(id);
		Endereco endereco = serviceEndereco.fromDTO(enderecoDto);
		endereco = serviceEndereco.insert(endereco);
		pessoa.setEndereco(endereco);
		pessoa = service.update(pessoa);
		return ResponseEntity.noContent().build();
	}
	/*
	@RequestMapping(value="/{id}/imagem", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Image imagemCpf, @PathVariable String id) {
		Pessoa pessoa = service.findById(id);
		pessoa.setImagemCpf(imagemCpf);
		pessoa = service.update(pessoa);
		return ResponseEntity.noContent().build();
	}
	*/
}
