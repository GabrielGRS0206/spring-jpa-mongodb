package br.com.product.api.mapper;

import br.com.product.api.dto.ProductRequestDto;
import br.com.product.api.dto.ProductResponseDto;
import br.com.product.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponseDto map(Product product);

    Product map(ProductRequestDto request);
}
