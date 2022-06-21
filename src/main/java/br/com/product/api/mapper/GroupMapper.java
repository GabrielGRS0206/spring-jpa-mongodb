package br.com.product.api.mapper;

import br.com.product.api.dto.GroupRequestDto;
import br.com.product.api.dto.GroupResponseDto;
import br.com.product.domain.model.Group;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupMapper {

    GroupResponseDto map(Group group);

    Group map(GroupRequestDto request);
}
