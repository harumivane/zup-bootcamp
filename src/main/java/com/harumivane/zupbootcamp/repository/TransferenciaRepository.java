package com.harumivane.zupbootcamp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harumivane.zupbootcamp.entities.Transferencia;

@Repository
public interface TransferenciaRepository extends MongoRepository<Transferencia, String> {

}
