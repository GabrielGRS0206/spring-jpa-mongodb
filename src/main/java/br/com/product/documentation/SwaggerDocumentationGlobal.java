package br.com.product.documentation;

import br.com.product.domain.exception.handler.Error;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApiResponses(value = {@ApiResponse(responseCode = "400", description = "Invalid requisition", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "403", description = "Accessing the resource you are trying to access is prohibited", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        @ApiResponse(responseCode = "500", description = "Server application failed to process request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class)))})
public @interface SwaggerDocumentationGlobal {

}
