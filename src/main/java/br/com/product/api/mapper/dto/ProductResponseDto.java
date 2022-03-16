package br.com.product.api.mapper.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class ProductResponseDto extends BaseResponseDto {

	private String id;
	private String name;
	private String description;
	private BigDecimal value;
}
