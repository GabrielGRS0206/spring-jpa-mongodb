package br.com.product.domain.exception.model;

public class EntityInUseException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public EntityInUseException(String mensagem) {
        super(mensagem);
    }

    public EntityInUseException(Long id) {
        this(String.format("Entity id %d cannot be removed", id));
    }

}