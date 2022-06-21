package br.com.product.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema
public class ProductRequestDto {

    @Schema(example = "Product test", description = "Name product")
    private String name;

    @Schema(example = "Description product", description = "Description")
    private String description;

    @Schema(example = "10,99", description = "Value product")
    private BigDecimal value;

    @Schema(example = "1", description = "Group product")
    private String groupId;
}
