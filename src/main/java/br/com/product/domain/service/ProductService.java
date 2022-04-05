package br.com.product.domain.service;

import java.util.List;

import br.com.product.domain.model.Product;

public interface ProductService {

	Product findById(String id);
	List<Product> findAll();
	Product save(Product product);
	void deleteById(String id);
	boolean existsById(String id);
}
