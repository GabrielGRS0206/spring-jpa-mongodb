package br.com.product.api.controller;

import br.com.product.api.dto.GroupRequestDto;
import br.com.product.api.dto.GroupResponseDto;
import br.com.product.api.mapper.GroupMapper;
import br.com.product.documentation.SwaggerDocumentationDELETE;
import br.com.product.documentation.SwaggerDocumentationGET;
import br.com.product.documentation.SwaggerDocumentationGETList;
import br.com.product.documentation.SwaggerDocumentationPOST;
import br.com.product.domain.service.GroupService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Group related operations")
@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService service;

    @Autowired
    private GroupMapper mapper = Mappers.getMapper(GroupMapper.class);

    @Operation(description = "Find by id group")
    @SwaggerDocumentationGET
    @GetMapping("/{id}")
    private GroupResponseDto findById(@PathVariable String id) {
        return mapper.map(service.findById(id));
    }

    @Operation(description = "Find all groups")
    @SwaggerDocumentationGETList
    @GetMapping
    private List<GroupResponseDto> findAll() {
        return service.findAll().stream().map(e -> mapper.map(e)).collect(Collectors.toList());
    }

    @Operation(description = "Save group")
    @SwaggerDocumentationPOST
    @PostMapping
    private GroupResponseDto save(@RequestBody GroupRequestDto product) {
        return mapper.map(service.save(mapper.map(product)));
    }

    @Operation(description = "Delete group")
    @SwaggerDocumentationDELETE
    @DeleteMapping("/{id}")
    private ResponseEntity<GroupResponseDto> deleteById(@PathVariable String id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
