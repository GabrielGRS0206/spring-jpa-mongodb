package br.com.product.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(Include.NON_NULL)
public class ProductResponseDto {

    private String id;
    private String name;
    private String description;
    private BigDecimal value;
    private GroupResponseDto group;
}
