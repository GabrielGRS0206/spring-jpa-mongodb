package br.com.product.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.product.api.dto.GroupRequestDto;
import br.com.product.api.dto.GroupResponseDto;
import br.com.product.domain.model.Group;

@Component
public class GroupMapper {

	public GroupResponseDto toDto(Group group) {
		var response = new GroupResponseDto();
		BeanUtils.copyProperties(group, response);
		return response;
	}

	public List<GroupResponseDto> toListDto(List<Group> list) {
		return list.stream().map(e -> toDto(e)).collect(Collectors.toList());
	}

	public Group toEntity(GroupRequestDto request) {
		var entity = new Group();
		BeanUtils.copyProperties(request, entity);
		return entity;
	} 
}
