package br.com.product.api.mapper;

import br.com.product.api.dto.GroupRequestDto;
import br.com.product.api.dto.GroupResponseDto;
import br.com.product.domain.model.Group;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
