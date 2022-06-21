package br.com.product.api.controller;

import java.util.List;
import java.util.stream.Collectors;

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

import br.com.product.api.dto.ProductRequestDto;
import br.com.product.api.dto.ProductResponseDto;
import br.com.product.domain.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private ProductMapper mapper = Mappers.getMapper(ProductMapper.class);
	
	@GetMapping("/{id}")
	private ProductResponseDto findById(@PathVariable String id) {
		return mapper.map(service.findById(id));
	}
	
	@GetMapping
	private List<ProductResponseDto> findAll(){
		return service.findAll().stream().map(e -> mapper.map(e)).collect(Collectors.toList());
	}
	
	@PostMapping
	private ProductResponseDto save(@RequestBody ProductRequestDto product) {
		return mapper.map(service.save(mapper.map(product)));
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<ProductResponseDto> deleteById(@PathVariable String id) {
		service.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
