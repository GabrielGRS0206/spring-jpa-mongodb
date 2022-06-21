package br.com.product.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.product.api.dto.ProductRequestDto;
import br.com.product.api.dto.ProductResponseDto;
import br.com.product.domain.model.Group;
import br.com.product.domain.model.Product;

@Component
public class ProductMapper {
	
	@Autowired
	private GroupMapper groupMapper;
	
	public ProductResponseDto toDto(Product product) {
		var response = new ProductResponseDto();
		BeanUtils.copyProperties(product, response);
		
		if(product.getGroup() != null) {
			response.setGroup(groupMapper.toDto(product.getGroup()));
		}
		return response;
	}

	public List<ProductResponseDto> toListDto(List<Product> list) {
		return list.stream().map(e -> toDto(e)).collect(Collectors.toList());
	}

	public Product toEntity(ProductRequestDto request) {
		var entity = new Product();
		BeanUtils.copyProperties(request, entity);
		
		if(Strings.isNotEmpty(request.getGroupId())) {
			entity.setGroup(new Group(request.getGroupId()));
		}
		return entity;
	} 
}
