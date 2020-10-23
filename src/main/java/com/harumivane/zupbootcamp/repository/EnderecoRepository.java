package com.harumivane.zupbootcamp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harumivane.zupbootcamp.entities.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {

}
