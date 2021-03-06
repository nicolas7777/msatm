package com.microservicio.app.document;

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
@Document(collection="atm")
@ToString
public class Atm {
	@Id
	private String id;
	@NotNull
	@Size(min = 8, max = 20)
	private String bankname;
	
}
