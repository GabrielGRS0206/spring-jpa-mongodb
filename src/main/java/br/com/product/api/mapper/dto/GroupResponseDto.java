package br.com.product.api.mapper.dto;

import lombok.Data;

@Data
public class GroupResponseDto extends BaseResponseDto{
	
	private String id;
	private String name;
	private String observation;
}
