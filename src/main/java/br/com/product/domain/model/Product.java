package br.com.product.domain.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Product {

	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal value;
}
