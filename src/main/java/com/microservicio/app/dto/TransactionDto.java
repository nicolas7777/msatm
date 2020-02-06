package com.microservicio.app.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data 
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionDto {
	
	private String id;
	private String accountcode;
	private Double amount;
	private String status;	
	private Date date; 
	private String kindtransaction;
	private Double commission;
	private String destinationaccountcode;
	private String bankname;
}
