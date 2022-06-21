package br.com.product.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Schema
public class GroupRequestDto {

    @Schema(example = "Name test", description = "Name group")
    @NotNull
    @NotBlank
    private String name;

    @Schema(example = "Group orange", description = "Observation for group")
    @NotNull
    @NotBlank
    private String observation;
}
