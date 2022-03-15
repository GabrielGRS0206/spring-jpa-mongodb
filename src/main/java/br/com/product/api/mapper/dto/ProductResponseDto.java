package br.com.product.api.mapper.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductResponseDto {

	private String id;
	private String name;
	private String description;
	private BigDecimal value;
}
