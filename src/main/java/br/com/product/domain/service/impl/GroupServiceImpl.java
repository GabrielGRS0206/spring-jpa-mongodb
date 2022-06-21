package br.com.product.domain.service.impl;

import br.com.product.domain.exception.model.BusinessException;
import br.com.product.domain.exception.model.EntityInUseException;
import br.com.product.domain.exception.model.EntityNotFoundException;
import br.com.product.domain.model.Group;
import br.com.product.domain.repository.GroupRepository;
import br.com.product.domain.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void deleteById(String id) {
        try {
            Group group = findById(id);
            repository.delete(group);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new EntityInUseException(id);
        }
    }

    @Override
    public boolean existsById(String id) {
        if (!repository.existsById(id)) {
            throw new BusinessException(GROUP_ID_NOT_FOUND);
        }
        return true;
    }

}
