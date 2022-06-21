//package br.com.product.api.mapper;
//
//import static org.junit.Assert.assertNotNull;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//
//import br.com.product.api.dto.ProductRequestDto;
//import br.com.product.api.dto.ProductResponseDto;
//import br.com.product.domain.model.Product;
//
//class ProductMapperTest {
//
//	@Test
//	void testToDto() {
//		ProductMapper mapper = new ProductMapper();
//
//		ProductResponseDto response = mapper.toDto(new Product());
//		assertNotNull(response);
//	}
//
//	@Test
//	void testToEntity() {
//		ProductMapper mapper = new ProductMapper();
//
//		Product request = mapper.toEntity(new ProductRequestDto());
//		assertNotNull(request);
//	}
//
//	@Test
//	void testToListToDto() {
//		ProductMapper mapper = new ProductMapper();
//
//		List<ProductResponseDto> list = mapper.toListDto(Arrays.asList(new Product()));
//		assertNotNull(list);
//	}
//
//}
