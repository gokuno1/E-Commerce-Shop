package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CartProxy;
import com.example.demo.pojos.OrderService;
import com.example.demo.services.OrderInfoServiceImpl;

@RestController
public class OrderServiceController {

	@Autowired
	CartProxy proxy;
	
	@Autowired
	OrderInfoServiceImpl service;
	
	@GetMapping("/orderservice/placeorder/{cartid}")
	public void placeOrder(@PathVariable int cartid)
	{
		OrderService response = proxy.getById(cartid);
		OrderService placeorder = new OrderService(response.getOrderId(), cartid, response.getProductId(), response.getProductName(), response.getProductPrice(), response.getProductQuantity(), response.getGender(), response.getProductImages(), response.getProductSize());
		service.placeOrder(placeorder);
		proxy.deleteFromCart(cartid);
	}
}
