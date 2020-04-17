package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.OrderDetailVO;

@FeignClient(value="order-service")
public interface OrderProxy {
	/*
	 * @GetMapping("/orderservice/placeorder/{cartid}") public PaymentModel
	 * placeOrder(@PathVariable int cartid);
	 */
	
	@GetMapping("/orderservice/getbyid/{orderid}")
	public OrderDetailVO getOrderById(@PathVariable int orderid);

	@DeleteMapping("/orderservice/deletebyid/{orderid}")
	public void deleteById(@PathVariable int orderid);
}
