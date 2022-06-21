package br.com.product.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema
@JsonInclude(Include.NON_NULL)
public class ProductResponseDto {

    @Schema(example = "1", description = "Id product")
    private String id;

    @Schema(example = "Product one", description = "Name product")
    private String name;

    @Schema(example = "Product test", description = "Description product")
    private String description;

    @Schema(example = "13,99", description = "Value product")
    private BigDecimal value;

    @Schema(description = "Group product")
    private GroupResponseDto group;
}
