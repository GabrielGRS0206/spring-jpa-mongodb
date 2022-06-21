package br.com.product.api.mapper;

import br.com.product.api.dto.ProductRequestDto;
import br.com.product.api.dto.ProductResponseDto;
import br.com.product.domain.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductMapperTest {

    ProductMapper mapper;

    @BeforeEach
	public void setUp() throws Exception {
		mapper = new ProductMapperImpl();
	}

	@Test
	void testToDto() {
		ProductResponseDto response = mapper.map(new Product());
		assertNotNull(response);
	}

	@Test
	void testToEntity() {
		Product request = mapper.map(new ProductRequestDto());
		assertNotNull(request);
	}
}
