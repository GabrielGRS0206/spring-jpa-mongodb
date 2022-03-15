package br.com.product.api.mapper.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductRequestDto {

	private String name;
	private String description;
	private BigDecimal value;
}
