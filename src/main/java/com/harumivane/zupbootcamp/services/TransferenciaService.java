package com.harumivane.zupbootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harumivane.zupbootcamp.dto.TransferenciaDTO;
import com.harumivane.zupbootcamp.entities.Transferencia;
import com.harumivane.zupbootcamp.repository.TransferenciaRepository;

@Service
public class TransferenciaService {

	@Autowired
	private TransferenciaRepository repo;
	
	public Transferencia insert(Transferencia transferencia) {
		return repo.insert(transferencia);
	}

	public Transferencia fromDTO(TransferenciaDTO transferenciaDto) {
		return new Transferencia(transferenciaDto.getId(), transferenciaDto.getValor(), transferenciaDto.getDataRealizacao(), transferenciaDto.getDocumento(), transferenciaDto.getBancoOrigem(), transferenciaDto.getContaOrigem(), transferenciaDto.getAgenciaOrigem(), transferenciaDto.getContaDestino(), transferenciaDto.getAgenciaDestino());
	}
}
