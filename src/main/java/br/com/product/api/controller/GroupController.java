package br.com.product.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import br.com.product.api.mapper.GroupMapper;
import br.com.product.api.mapper.ProductMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.product.api.dto.GroupRequestDto;
import br.com.product.api.dto.GroupResponseDto;
import br.com.product.domain.service.GroupService;

@RestController
@RequestMapping("/groups")
public class GroupController {

	@Autowired
	private GroupService service;
	
	@Autowired
	private GroupMapper mapper = Mappers.getMapper(GroupMapper.class);;
	
	@GetMapping("/{id}")
	private GroupResponseDto findById(@PathVariable String id) {
		return mapper.map(service.findById(id));
	}
	
	@GetMapping
	private List<GroupResponseDto> findAll(){
		return service.findAll().stream().map(e -> mapper.map(e)).collect(Collectors.toList());
	}
	
	@PostMapping
	private GroupResponseDto save(@RequestBody GroupRequestDto product) {
		return mapper.map(service.save(mapper.map(product)));
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<GroupResponseDto> deleteById(@PathVariable String id) {
		service.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
