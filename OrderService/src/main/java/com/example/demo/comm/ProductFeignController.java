package com.example.demo.comm;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.ProductDataVO;

@FeignClient(value = "product-service")
public interface ProductFeignController {
	
	@GetMapping("/getAll")
	public List<ProductDataVO> getAllProducts();

}
