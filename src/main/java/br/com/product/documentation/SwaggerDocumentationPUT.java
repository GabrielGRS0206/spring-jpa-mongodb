package br.com.product.documentation;

import br.com.product.domain.exception.handler.Error;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Resource successfully changed"),
        @ApiResponse(responseCode = "404", description = "The resource you were trying to change was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class)))})
public @interface SwaggerDocumentationPUT {

}
