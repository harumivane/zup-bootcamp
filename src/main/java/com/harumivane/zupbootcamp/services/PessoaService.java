package com.harumivane.zupbootcamp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harumivane.zupbootcamp.dto.PessoaDTO;
import com.harumivane.zupbootcamp.entities.Pessoa;
import com.harumivane.zupbootcamp.repository.PessoaRepository;
import com.harumivane.zupbootcamp.services.exception.ObjectNotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public Pessoa insert(Pessoa pessoa) {
		return repo.insert(pessoa);
	}
	
	public Pessoa update(Pessoa pessoa) {
		Pessoa upPessoa = findById(pessoa.getId());
		updateData(upPessoa, pessoa);
		return repo.save(upPessoa);
	}
	
	private void updateData(Pessoa upPessoa, Pessoa pessoa) {
		upPessoa.setEndereco(pessoa.getEndereco());
	}
	
	public Pessoa findById(String id) {
		Optional<Pessoa> pessoa = repo.findById(id);
		return pessoa.orElseThrow(() -> new ObjectNotFoundException("Pessoa não encontrada"));
	}

	public Pessoa fromDTO(PessoaDTO pessoaDto) {
		return new Pessoa(pessoaDto.getId(), pessoaDto.getNome(), pessoaDto.getSobrenome(), pessoaDto.getEmail(), pessoaDto.getDataNascimento(), pessoaDto.getCpf());
	}
}
