package br.com.product.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.product.domain.model.Group;

public interface GroupRepository extends MongoRepository<Group, String>{

}
