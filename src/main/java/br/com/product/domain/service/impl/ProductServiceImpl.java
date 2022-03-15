package br.com.product.domain.service.impl;

import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.product.domain.model.Group;
import br.com.product.domain.model.Product;
import br.com.product.domain.repository.ProductRepository;
import br.com.product.domain.service.GroupService;
import br.com.product.domain.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static final String PRODUCT_ID_NOT_FOUND = "Product id not found";
	
	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private GroupService groupService;
	
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
		
		if(product.getGroup() != null  && Strings.isNotEmpty(product.getGroup().getId())) {
			Group group = this.groupService.findById(product.getGroup().getId());
			product.setGroup(group);
		}
		
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
			throw new IllegalArgumentException(PRODUCT_ID_NOT_FOUND);
		}
		return true;
	}

}
