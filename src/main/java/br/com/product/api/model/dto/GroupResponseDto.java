package br.com.product.api.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class GroupResponseDto extends BaseResponseDto{
	
	private String id;
	private String name;
	private String observation;
}
