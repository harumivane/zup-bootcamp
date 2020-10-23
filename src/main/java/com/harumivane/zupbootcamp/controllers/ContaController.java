package com.harumivane.zupbootcamp.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.harumivane.zupbootcamp.dto.ContaDTO;
import com.harumivane.zupbootcamp.dto.TransferenciaDTO;
import com.harumivane.zupbootcamp.entities.Conta;
import com.harumivane.zupbootcamp.entities.Pessoa;
import com.harumivane.zupbootcamp.entities.Transferencia;
import com.harumivane.zupbootcamp.services.ContaService;
import com.harumivane.zupbootcamp.services.PessoaService;
import com.harumivane.zupbootcamp.services.TransferenciaService;

@RestController
@RequestMapping(value="/conta")
public class ContaController {

	@Autowired
	private ContaService service;
	
	@Autowired
	private PessoaService servicePessoa;
	
	@Autowired
	private TransferenciaService serviceTransferencia;
	
	/*
	@Autowired 
	private JavaMailSender mailSender;
	*/
	
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody ContaDTO contaDto, @PathVariable String id) {
		Conta conta = service.fromDTO(contaDto);
		Pessoa pessoa = servicePessoa.findById(id);
		conta.setPessoa(pessoa);
		conta = service.insert(conta);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(conta.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	/*
	@RequestMapping(value="{id}/email", method=RequestMethod.GET)
    public String sendMail(@PathVariable String id) {
		Conta conta = service.findById(id);
		Pessoa pessoa = servicePessoa.findById(conta.getPessoa().getId());
		
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("Conta criada! " + conta.toString());
        message.setTo("email@gmail.com");
        message.setFrom(pessoa.getEmail());

        try {
            mailSender.send(message);
            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email.";
        }
    }
    */
	
	@RequestMapping(value="/transferencia", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody TransferenciaDTO transferenciaDto) {
		Transferencia transferencia = serviceTransferencia.fromDTO(transferenciaDto);
		Conta conta = service.findByConta(transferencia.getContaDestino(), transferencia.getAgenciaDestino());
		transferencia = serviceTransferencia.insert(transferencia);
		conta.deposit(transferencia.getValor());
		conta = service.update(conta);
		return ResponseEntity.noContent().build();
	}
}
