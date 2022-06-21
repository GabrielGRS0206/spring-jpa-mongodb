package br.com.product.domain.service;

import br.com.product.domain.model.Group;

import java.util.List;

public interface GroupService {

    Group findById(String id);

    List<Group> findAll();

    Group save(Group group);

    void deleteById(String id);

    boolean existsById(String id);
}
