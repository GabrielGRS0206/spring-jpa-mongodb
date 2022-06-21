package br.com.product.domain.exception.handler;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public class Field {

    @Schema(example = "value", description = "Name field")
    private String name;

    @Schema(example = "value", description = "Field is not blank")
    private String message;

    public Field(String name, String message) {
        super();
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
