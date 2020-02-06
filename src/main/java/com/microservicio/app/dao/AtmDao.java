package com.microservicio.app.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.microservicio.app.document.Atm;

import reactor.core.publisher.Mono;

public interface AtmDao extends ReactiveMongoRepository<Atm,String> {
	//@Query(value = "{'bankname' : ?0}")
	public Mono<Atm> findByBankname(String bankname);
}



