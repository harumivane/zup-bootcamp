package com.harumivane.zupbootcamp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harumivane.zupbootcamp.dto.ContaDTO;
import com.harumivane.zupbootcamp.entities.Conta;
import com.harumivane.zupbootcamp.repository.ContaRepository;
import com.harumivane.zupbootcamp.services.exception.ObjectNotFoundException;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository repo;
	
	public Conta insert(Conta conta) {
		return repo.insert(conta);
	}
	
	public Conta update(Conta conta) {
		return repo.save(conta);
	}
	
	public Conta findById(String id) {
		Optional<Conta> conta = repo.findById(id);
		return conta.orElseThrow(() -> new ObjectNotFoundException("Conta não encontrada"));
	}
	
	public Conta findByConta(Integer conta, Integer agencia) {
		return repo.buscarConta(conta, agencia);
	}

	public Conta fromDTO(ContaDTO contaDto) {
		return new Conta(contaDto.getId(), contaDto.getAgencia(), contaDto.getConta(), contaDto.getCodigoBanco(), contaDto.getSaldo());
	}
}
