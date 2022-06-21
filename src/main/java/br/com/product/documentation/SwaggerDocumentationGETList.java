package br.com.product.documentation;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successfully retrieved all resources")})
public @interface SwaggerDocumentationGETList {

}
