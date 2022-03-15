package br.com.product.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.product.domain.model.Product;
import br.com.product.domain.repository.ProductRepository;
import br.com.product.domain.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static final String PRODUCT_ID_NOT_FOUND = "Produc id not found";
	
	@Autowired
	private ProductRepository repository;
	
	@Override
	public Product findById(String id) {
		return repository.findById(id).orElseThrow(() -> new IllegalArgumentException(PRODUCT_ID_NOT_FOUND));
	}

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public Product save(Product product) {
		return repository.save(product);
	}

}
