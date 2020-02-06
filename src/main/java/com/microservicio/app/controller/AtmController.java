package com.microservicio.app.controller;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.app.document.Atm;

import com.microservicio.app.dto.AccountDto;
import com.microservicio.app.dto.InterbanktransactionDto;
import com.microservicio.app.dto.TransactionDto;
import com.microservicio.app.service.IAtmService;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/atm")
public class AtmController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AtmController.class);
	//inyeccion de dependencias
	@Autowired
	private IAtmService atmService;
	

	@PostMapping("/createdeposit")
	@ApiOperation(value = "CREATE DEPOSIT ATM", notes="")
	Mono<AccountDto> createdeposit(@RequestBody TransactionDto transactionDto){
		//LOGGER.info("AtmController");		
		return this.atmService.createdeposit(transactionDto);
	}
	
	@PostMapping("/createretirement")
	@ApiOperation(value = "CREATE RETIREMENT ATM", notes="")
	Mono<AccountDto> createretirement(@RequestBody TransactionDto transactionDto){
		//LOGGER.info("AtmController");		
		return this.atmService.createretirement(transactionDto);
	}
	
	@PostMapping("/interbanktransaction")
	@ApiOperation(value = "INTERBANK TRANSACTION ATM", notes="")	
	Mono<AccountDto> interbanktransaction(@RequestBody InterbanktransactionDto interbanktransactionDto){
		//LOGGER.info("AtmController");		
		return this.atmService.interbanktransaction(interbanktransactionDto);
	}
	
}
