package br.com.product.api.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestDto {

    private String name;
    private String description;
    private BigDecimal value;
    private String groupId;
}
