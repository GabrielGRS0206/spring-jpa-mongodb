package br.com.product.domain.exception.model;


public class EntityNotFoundException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(String mensagem) {
		super(mensagem);
	}

	public EntityNotFoundException(Long id) {
		this(String.format("Not found entity code %d", id));
	}

}