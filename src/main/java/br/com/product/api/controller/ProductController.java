package br.com.product.api.controller;

import br.com.product.api.dto.ProductRequestDto;
import br.com.product.api.dto.ProductResponseDto;
import br.com.product.api.mapper.ProductMapper;
import br.com.product.documentation.SwaggerDocumentationDELETE;
import br.com.product.documentation.SwaggerDocumentationGET;
import br.com.product.documentation.SwaggerDocumentationGETList;
import br.com.product.documentation.SwaggerDocumentationPOST;
import br.com.product.domain.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Products related operations")
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    @Operation(description = "Find by id product")
    @SwaggerDocumentationGET
    @GetMapping("/{id}")
    private ProductResponseDto findById(@PathVariable String id) {
        return mapper.map(service.findById(id));
    }

    @Operation(description = "Find all products")
    @SwaggerDocumentationGETList
    @GetMapping
    private List<ProductResponseDto> findAll() {
        return service.findAll().stream().map(e -> mapper.map(e)).collect(Collectors.toList());
    }

    @Operation(description = "Save product")
    @SwaggerDocumentationPOST
    @PostMapping
    private ProductResponseDto save(@RequestBody ProductRequestDto product) {
        return mapper.map(service.save(mapper.map(product)));
    }

    @Operation(description = "Delete product")
    @SwaggerDocumentationDELETE
    @DeleteMapping("/{id}")
    private ResponseEntity<ProductResponseDto> deleteById(@PathVariable String id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
