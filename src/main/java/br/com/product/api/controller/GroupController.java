package br.com.product.api.controller;

import java.util.List;

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

import br.com.product.api.model.dto.GroupRequestDto;
import br.com.product.api.model.dto.GroupResponseDto;
import br.com.product.api.model.mapper.GroupMapper;
import br.com.product.domain.service.GroupService;

@RestController
@RequestMapping("/groups")
public class GroupController {

	@Autowired
	private GroupService service;
	
	@Autowired
	private GroupMapper mapper;
	
	@GetMapping("/{id}")
	private GroupResponseDto findById(@PathVariable String id) {
		return mapper.toDto(service.findById(id));
	}
	
	@GetMapping
	private List<GroupResponseDto> findAll(){
		return mapper.toListDto(service.findAll());
	}
	
	@PostMapping
	private GroupResponseDto save(@RequestBody GroupRequestDto product) {
		return mapper.toDto(service.save(mapper.toEntity(product)));
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<GroupResponseDto> deleteById(@PathVariable String id) {
		service.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
