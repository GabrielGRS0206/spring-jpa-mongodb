package br.com.product.domain.service;

import br.com.product.domain.model.Product;

import java.util.List;

public interface ProductService {

    Product findById(String id);

    List<Product> findAll();

    Product save(Product product);

    void deleteById(String id);

    boolean existsById(String id);
}
