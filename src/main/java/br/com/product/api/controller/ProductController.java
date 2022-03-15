package br.com.product.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.product.api.mapper.ProductMapper;
import br.com.product.api.mapper.dto.ProductRequestDto;
import br.com.product.api.mapper.dto.ProductResponseDto;
import br.com.product.domain.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private ProductMapper mapper;
	
	@GetMapping("/{id}")
	private ProductResponseDto findById(@PathVariable String id) {
		return mapper.toDto(service.findById(id));
	}
	
	@GetMapping
	private List<ProductResponseDto> findAll(){
		return mapper.toListDto(service.findAll());
	}
	
	@PostMapping
	private ProductResponseDto save(@RequestBody ProductRequestDto product) {
		return mapper.toDto(service.save(mapper.toEntity(product)));
	}
}
