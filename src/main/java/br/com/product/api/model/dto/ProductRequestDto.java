package br.com.product.api.model.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductRequestDto {

	private String name;
	private String description;
	private BigDecimal value;
	private String groupId;
}
