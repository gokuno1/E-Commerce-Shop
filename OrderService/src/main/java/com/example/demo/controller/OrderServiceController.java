package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CartProxy;
import com.example.demo.model.OrderService;
import com.example.demo.services.OrderInfoServiceImpl;
import com.example.demo.utils.ResponseUtils;

@RestController
public class OrderServiceController {

	/*
	 * @Autowired CartProxy proxy;
	 */
	
	@Autowired
	OrderInfoServiceImpl service;
	
	@PostMapping("/orderservice/placeorder/{cartId}")
	public ResponseEntity<OrderService> placeOrder(@PathVariable int cartId)
	{
		ResponseEntity<OrderService> resp = null;
		OrderService order = new OrderService();
		if(service.placeOrder(cartId))
		{
			resp=ResponseUtils.getOKResponse(order);
			return resp;
		}
		else
		{
			resp=ResponseUtils.getBadRequestResponse(order);
			return resp;
		}
	}
	
	@GetMapping("/orderservice/getbyid/{orderid}")
	public OrderService getOrderById(@PathVariable int orderid)
	{
		return service.getbyOrderId(orderid);
	}
	
	@DeleteMapping("/orderservice/deletebyid/{orderid}")
	public void deleteById(@PathVariable int orderid)
	{
		service.deletebyid(orderid);
	}
	
	
}
