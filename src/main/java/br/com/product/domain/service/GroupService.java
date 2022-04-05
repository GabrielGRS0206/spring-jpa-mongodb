package br.com.product.domain.service;

import java.util.List;

import br.com.product.domain.model.Group;

public interface GroupService {

	Group findById(String id);
	List<Group> findAll();
	Group save(Group group);
	void deleteById(String id);
	boolean existsById(String id);
}
