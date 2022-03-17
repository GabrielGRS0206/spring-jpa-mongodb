package br.com.product.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.product.domain.exception.model.BusinessException;
import br.com.product.domain.model.Group;
import br.com.product.domain.repository.GroupRepository;
import br.com.product.domain.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	private static final String GROUP_ID_NOT_FOUND = "Group id not found";
	
	@Autowired
	private GroupRepository repository;
	
	@Override
	public Group findById(String id) {
		return repository.findById(id).orElseThrow(() -> new BusinessException(GROUP_ID_NOT_FOUND));
	}

	@Override
	public List<Group> findAll() {
		return repository.findAll();
	}

	@Override
	public Group save(Group product) {
		return repository.save(product);
	}

	@Override
	public boolean deleteById(String id) {
		if(existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public boolean existsById(String id) {
		if(!repository.existsById(id)) {
			throw new BusinessException(GROUP_ID_NOT_FOUND);
		}
		return true;
	}

}
