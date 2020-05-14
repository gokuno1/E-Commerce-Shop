package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.pojos.ProductServiceVO;

@FeignClient("product-service")
public interface ProductProxy {

	@GetMapping("/productservice/getbyid/{id}")
	public ProductServiceVO getProductById(@PathVariable int id);
	
}
