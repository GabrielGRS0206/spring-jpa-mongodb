package br.com.product.api.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.product.api.mapper.dto.GroupRequestDto;
import br.com.product.api.mapper.dto.GroupResponseDto;
import br.com.product.domain.model.Group;

class GroupMapperTest {

	@Test
	void testToDto() {
		GroupMapper mapper = new GroupMapper();

		GroupResponseDto response = mapper.toDto(new Group());
		assertNotNull(response);
	}

	@Test
	void testToEntity() {
		GroupMapper mapper = new GroupMapper();

		Group request = mapper.toEntity(new GroupRequestDto());
		assertNotNull(request);
	}
	
	@Test
	void testToListToDto() {
		GroupMapper mapper = new GroupMapper();

		List<GroupResponseDto> list = mapper.toListDto(Arrays.asList(new Group()));
		assertNotNull(list);
	}

}
