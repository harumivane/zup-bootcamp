package com.harumivane.zupbootcamp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harumivane.zupbootcamp.entities.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String> {

}
