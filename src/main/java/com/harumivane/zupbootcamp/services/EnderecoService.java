package com.harumivane.zupbootcamp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harumivane.zupbootcamp.dto.EnderecoDTO;
import com.harumivane.zupbootcamp.entities.Endereco;
import com.harumivane.zupbootcamp.repository.EnderecoRepository;
import com.harumivane.zupbootcamp.services.exception.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco insert(Endereco endereco) {
		return repo.insert(endereco);
	}
	
	public Endereco findById(String id) {
		Optional<Endereco> endereco = repo.findById(id);
		return endereco.orElseThrow(() -> new ObjectNotFoundException("Endereco não encontrada"));
	}
	
	public Endereco fromDTO(EnderecoDTO enderecoDTO) {
		return new Endereco(enderecoDTO.getId(), enderecoDTO.getCep(), enderecoDTO.getRua(), enderecoDTO.getBairro(), enderecoDTO.getComplemento(), enderecoDTO.getCidade(), enderecoDTO.getEstado());
	}
}
