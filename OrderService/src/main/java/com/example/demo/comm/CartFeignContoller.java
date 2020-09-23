package com.example.demo.comm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.CartServiceVO;

@FeignClient(value = "cart-service")
public interface CartFeignContoller {

	@GetMapping("/cartservice/getbyid/{cartid}")
	public CartServiceVO getById(@PathVariable int cartid);
	
	@DeleteMapping("/cartservice/delete/{cartid}")
	public void deleteFromCart(@PathVariable int cartid);
	
}
