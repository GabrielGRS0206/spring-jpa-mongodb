package br.com.product.api.mapper;

import br.com.product.api.dto.GroupRequestDto;
import br.com.product.api.dto.GroupResponseDto;
import br.com.product.domain.model.Group;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class GroupMapperTest {

    GroupMapper mapper;

    @BeforeEach
    public void setUp() throws Exception {
        mapper = new GroupMapperImpl();
    }

    @Test
    void testToDto() {
        GroupResponseDto response = mapper.map(new Group());
        assertNotNull(response);
    }

    @Test
    void testToEntity() {
        Group request = mapper.map(new GroupRequestDto());
        assertNotNull(request);
    }
}
