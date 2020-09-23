package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.OrderService;

//@FeignClient("cart-service")
public interface CartProxy {

	@GetMapping("/cartservice/getbyid/{cartid}")
	public OrderService getById(@PathVariable int cartid);
	
	@DeleteMapping("/cartservice/delete/{cartid}")
	public void deleteFromCart(@PathVariable int cartid);
}
