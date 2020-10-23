package com.harumivane.zupbootcamp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.harumivane.zupbootcamp.entities.Conta;

@Repository
public interface ContaRepository extends MongoRepository<Conta, String> {

	@Query("{ $and: [ { conta: { $eq: ?0 } }, { agencia: { $eq: ?1 } } ] }")
	Conta buscarConta(Integer conta, Integer agencia);
}
