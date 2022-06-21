package br.com.product.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema
@JsonInclude(Include.NON_NULL)
public class GroupResponseDto {

    @Schema(example = "1", description = "Id group")
    private String id;

    @Schema(example = "Group one", description = "Name group")
    private String name;

    @Schema(example = "Observation test", description = "Observation")
    private String observation;
}
