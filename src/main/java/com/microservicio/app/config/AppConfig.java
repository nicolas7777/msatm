package com.microservicio.app.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {	
	@Bean 
	@Qualifier("transaction")
	public WebClient registrarWebClientforTransaction () {
		//local
		return WebClient.create("http://localhost:8891/transaction");
		//remoto
//		return WebClient.create("http://mstransaction:8891/transaction");
	}	
	@Bean 
	@Qualifier("account")
	public WebClient registrarWebClientforAccount () {
		//local
		return WebClient.create("http://localhost:8891/account");
		//remoto
//		return WebClient.create("http://msaccount:8891/account");
	}	
	
}
