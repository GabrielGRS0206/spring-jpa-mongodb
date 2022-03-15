package br.com.product.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Group {

	@Id
	private String id;
	private String name;
	private String observation;
}
