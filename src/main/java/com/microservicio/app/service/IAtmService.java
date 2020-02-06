package com.microservicio.app.service;


import com.microservicio.app.dto.AccountDto;
import com.microservicio.app.dto.InterbanktransactionDto;
import com.microservicio.app.dto.TransactionDto;

import reactor.core.publisher.Mono;

public interface IAtmService {
	public Mono<AccountDto> createdeposit (TransactionDto transactionDto);
	public Mono<AccountDto> createretirement (TransactionDto transactionDto);
	public Mono<AccountDto> interbanktransaction(InterbanktransactionDto interbanktransactionDto);
	
}
 