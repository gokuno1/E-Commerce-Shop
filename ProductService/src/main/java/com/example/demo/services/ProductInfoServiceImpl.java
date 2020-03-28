package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojos.ProductService;
import com.example.demo.repository.ProductServiceRepository;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	ProductServiceRepository repository;
	
	@Override
	public void addProduct(ProductService product) {
		// TODO Auto-generated method stub
		repository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		repository.deleteById(productId);
	}

	@Override
	public void updateProduct(ProductService product) {
		// TODO Auto-generated method stub
		Optional<ProductService> update = repository.findById(product.getProductId());
		if(update.isPresent())
		{
			repository.save(product);
		}
	}

	@Override
	public ProductService getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<ProductService> getById = repository.findById(id);
		if(getById.isPresent())
		{
			return getById.get();
		}
		return null;
	}

	@Override
	public List<ProductService> getAllProduct() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<ProductService> getByCategory(String productCategory) {
		// TODO Auto-generated method stub
		return repository.getByCategory(productCategory);
		
	}

	@Override
	public List<ProductService> getByGender(String gender) {
		// TODO Auto-generated method stub
		return repository.getByGender(gender);
	}

}
