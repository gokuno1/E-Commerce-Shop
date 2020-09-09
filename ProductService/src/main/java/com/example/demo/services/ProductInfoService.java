package com.example.demo.services;

import java.util.List;

import com.example.demo.pojos.Product;
import com.example.demo.pojos.ProductService;

public interface ProductInfoService {

	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct(ProductService product);
	public ProductService getProductById(int id);
	public List<ProductService> getAllProduct();
	public List<ProductService> getByCategory(String productCategory);
	public List<ProductService> getByGender(String gender);
	public List<ProductService> getBySizeId(ProductService sizeId);
}
