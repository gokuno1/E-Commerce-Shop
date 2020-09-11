package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojos.Product;
import com.example.demo.pojos.ProductCategory;
import com.example.demo.pojos.ProductService;
import com.example.demo.pojos.ProductSize;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductServiceRepository;
import com.example.demo.repository.SizeRepository;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	ProductServiceRepository repository;
	
	@Autowired
	SizeRepository sizeRepository;
	
	@Autowired
	CategoryRepository catRepository;
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
		  ProductSize size= sizeRepository.findBySizeValue(product.getSizeName());
		  ProductCategory category = catRepository.getByCategoryName(product.getCategoryName());
		  
		  ProductService productDetails = new ProductService();
		  productDetails.setProductName(product.getProductName());
		  productDetails.setCategoryId(category.getCategoryId());
		  productDetails.setSizeId(size.getSizeId());
		  productDetails.setProductImages(product.getProductImages());
		  productDetails.setProductPrice(product.getProductPrice());
		  productDetails.setGender(product.getGender());
		  
		  repository.save(productDetails);
		 
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
		return null;//repository.getByCategory(productCategory);
		
	}

	@Override
	public List<ProductService> getByGender(String gender) {
		// TODO Auto-generated method stub
		return null; //repository.getByGender(gender);
	}

	@Override
	public List<ProductService> getBySizeId(ProductService sizeId) {
		// TODO Auto-generated method stub
		//String sizeValue = size.findBySizeId(sizeId.getSizeId());
		return null;
	}

}
