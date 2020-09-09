package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojos.Product;
import com.example.demo.pojos.ProductService;
import com.example.demo.services.ProductInfoServiceImpl;

@RestController
@RequestMapping("/productservice")
public class ProductServiceController {

	@Autowired
	ProductInfoServiceImpl service;
	
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product product)
	{
		service.addProduct(product);
	}
	
	@DeleteMapping("/deleteproduct/{productId}")
	public void deleteProduct(@PathVariable int productId)
	{
		service.deleteProduct(productId);
	}
	
	@PutMapping("/updateproduct")
	public void updateProduct(@RequestBody ProductService product)
	{
		service.updateProduct(product);
	}
	
	@GetMapping("/getbyid/{id}")
	public ProductService getProductById(@PathVariable int id)
	{
		return service.getProductById(id);
	}
	
	@GetMapping("/getbycategory/{productCategory}")
	public List<ProductService> getProductByCategory(@PathVariable String productCategory)
	{
		return service.getByCategory(productCategory);
	}
	
	@GetMapping("/getbygender/{gender}")
	public List<ProductService> getProductByGender(@PathVariable String gender)
	{
		return service.getByGender(gender);
	}
	
	@GetMapping("/getAll")
	public List<ProductService> getAllProducts()
	{
		return service.getAllProduct();
	}
	
}
