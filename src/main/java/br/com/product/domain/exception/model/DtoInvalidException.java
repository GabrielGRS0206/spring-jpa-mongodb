package br.com.product.domain.exception.model;

public class DtoInvalidException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public DtoInvalidException(String message) {
        super(message);
    }

    public DtoInvalidException(StringBuilder builder) {
        this(builder.toString());
    }

}
