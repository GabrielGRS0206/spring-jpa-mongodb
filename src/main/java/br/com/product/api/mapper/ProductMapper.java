package br.com.product.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.product.api.mapper.dto.ProductRequestDto;
import br.com.product.api.mapper.dto.ProductResponseDto;
import br.com.product.domain.model.Product;

@Component
public class ProductMapper {

	public ProductResponseDto toDto(Product product) {
		var response = new ProductResponseDto();
		BeanUtils.copyProperties(product, response);
		return response;
	}

	public List<ProductResponseDto> toListDto(List<Product> list) {
		return list.stream().map(e -> toDto(e)).collect(Collectors.toList());
	}

	public Product toEntity(ProductRequestDto request) {
		var entity = new Product();
		BeanUtils.copyProperties(request, entity);
		return entity;
	} 
}
