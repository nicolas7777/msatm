package com.microservicio.app.service;

import java.net.URI;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.microservicio.app.config.TransactionConfig;
import com.microservicio.app.dao.AtmDao;
import com.microservicio.app.dto.AccountDto;
import com.microservicio.app.dto.InterbanktransactionDto;
import com.microservicio.app.dto.TransactionDto;


import reactor.core.publisher.Mono;

@Service
public class AtmServiceImpl implements IAtmService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AtmServiceImpl.class);

	@Autowired
	private TransactionConfig transactionConfig;

	@Autowired
	private AtmDao atmDao;

	@Override
	public Mono<AccountDto> createdeposit (TransactionDto transactionDto) {	
		return this.atmDao.findById(transactionDto.getBankname())
		.flatMap( p->{ 
			if(p.getBankname()!=null)
				return this.transactionConfig.CreateDeposit(transactionDto);
			else
				return this.transactionConfig.CreateDeposit(transactionDto);
		});			
	}	
	
	@Override
	public Mono<AccountDto> createretirement (TransactionDto transactionDto) {		
		return this.atmDao.findById(transactionDto.getBankname())
				.flatMap( p->{ 
					if(p.getBankname()!=null)
						return this.transactionConfig.CreateRetirement(transactionDto);
					else
						return this.transactionConfig.CreateRetirement(transactionDto);
				});		 
	}
	
	
	
	@Override
	public Mono<AccountDto> interbanktransaction(InterbanktransactionDto interbanktransactionDto) {
		return this.atmDao.findById(interbanktransactionDto.getBankname())
				.flatMap( p->{ 
					if(p.getBankname()!=null)
						return this.transactionConfig.InterbankTransaction(interbanktransactionDto);
					else
						return this.transactionConfig.InterbankTransaction(interbanktransactionDto);
				});			 
	}


}
