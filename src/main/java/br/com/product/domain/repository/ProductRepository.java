package br.com.product.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.product.domain.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
